package cn.pingweb.controller;

import cn.pingweb.dto.ResultDto;
import cn.pingweb.dto.UserScoreDto;
import cn.pingweb.entity.ExamResult;
import cn.pingweb.enums.ResultCode;
import cn.pingweb.exception.ParamException;
import cn.pingweb.exception.WXExcetion;
import cn.pingweb.service.IExamService;
import cn.pingweb.utils.ParamUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

@Controller
public class StudentController {

    @Autowired
    private IExamService examService;

    public void joinClassTS() {

    }

    public void doExam() {

    }

    @RequestMapping(value = "/wx/{wxid}/score",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public ResultDto submitExam(@PathVariable("uid") String uid, @RequestBody Map<String, Object> map) {
        ResultDto resultDto = new ResultDto(ResultCode.SUCCESS);
        try {
            String type = ParamUtil.getValue(map, "type");
            Double score = ParamUtil.getValue(map, "score");
            ExamResult examResult = new ExamResult("0759", uid, type, score, new Date());
            examService.submitExam(examResult);
            resultDto.setObject(examResult);
        } catch (ParamException excetion) {
            resultDto = new ResultDto(ResultCode.ERRO, null);
        } catch (WXExcetion excetion) {
            resultDto = new ResultDto(ResultCode.FAIL, null);
        }

        return resultDto;
    }
}
