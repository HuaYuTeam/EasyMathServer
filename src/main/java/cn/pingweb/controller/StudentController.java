package cn.pingweb.controller;

import cn.pingweb.dto.ResponseDto;
import cn.pingweb.entity.ExamResult;
import cn.pingweb.exception.WXExcetion;
import cn.pingweb.service.IExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IExamService examService;

    public void joinClassTS() {

    }

    public void doExam() {

    }

    @RequestMapping(value = "/wx/{wxid}/score",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"}
            )
    @ResponseBody
    public ResponseDto submitExam(@PathVariable("wxid") String uid,
                                  @RequestParam("type") String type,
                                  @RequestParam("score") double score) {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
//            String type = ParamUtil.getValue(map, "type");
//            Double score = ParamUtil.getValue(map, "score");
            ExamResult examResult = new ExamResult("0759", uid, type, score, new Date());
            examService.submitExam(examResult);
            result.put("score", examResult);
        } catch (WXExcetion excetion) {
            return ResponseDto.erro();
        }

        return ResponseDto.success(result);
    }
}
