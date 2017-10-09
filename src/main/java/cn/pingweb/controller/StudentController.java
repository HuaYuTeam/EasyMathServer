package cn.pingweb.controller;

import cn.pingweb.dto.ResponseDto;
import cn.pingweb.entity.ExamResult;
import cn.pingweb.exception.WXException;
import cn.pingweb.service.impl.ExamServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

// /EasyMathServer/student/wx/123/score
@Controller
@RequestMapping("/student")
public class StudentController {

    private final String SCORE = "score";
    private final String GRADE_LIST = "gradeList";
    @Autowired
    private ExamServiceImpl examService;

    public void joinClassTS() {

    }

    @RequestMapping(value = "/doExam")
    public void doExam() {
        System.out.println();
    }


    @RequestMapping(value = "/wx/{wxid}/score",
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
            ExamResult examResult = new ExamResult( uid, type, score, new Date());
            examService.submitExam(examResult);
            result.put(SCORE, examResult);

        } catch (WXException exception) {
            exception.printStackTrace();
            return ResponseDto.erro();
        }

        return ResponseDto.success(result);

    }

    @RequestMapping(value = "/listGrade",
            produces = {"application/json;charset=UTF-8"}
    )
    @ResponseBody
    public ResponseDto listGrade(@RequestParam("wxid") String uid) {
        Map<String, Object> result = new HashMap<>();


        List<ExamResult> examResultList = examService.getEaxamResultsByWxId(uid);
        Collections.sort(examResultList);

        result.put(GRADE_LIST, examResultList.toArray());

        return ResponseDto.success(result);
    }
}
