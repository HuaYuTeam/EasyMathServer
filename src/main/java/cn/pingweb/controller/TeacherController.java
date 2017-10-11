package cn.pingweb.controller;

import cn.pingweb.dto.ResponseDto;
import cn.pingweb.entity.ExamResult;
import cn.pingweb.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/EasyMathServer/teacher")
public class TeacherController {

    private final String GRADE_LIST = "gradeList";
    @Autowired
    private ITeacherService teacherService;

    // 创建班级
    @RequestMapping(value = "/createClass",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"}
    )
    @ResponseBody
    public ResponseDto createClassTS() {
        Map<String, Object> result = new HashMap<String, Object>();

        try {
            teacherService.createClassTS();
            result.put("success", true);
        } catch (Exception excetion) {
            return ResponseDto.erro();
        }

        return ResponseDto.success(result);
    }

    // 查看某个学生
    public void checkStudent() {
        teacherService.checkStudent();
    }

    // 查看所有学生
    @RequestMapping(value = "/listGrade",
            produces = {"application/json;charset=UTF-8"}
    )
    @ResponseBody
    public ResponseDto listGrade(@RequestParam("wxid") String uid) {
        Map<String, Object> result = new HashMap<String, Object>();


        List<ExamResult> examResultList = teacherService.checkAllStudents();
        Collections.sort(examResultList);

        result.put(GRADE_LIST, examResultList.toArray());

        return ResponseDto.success(result);
    }
}
