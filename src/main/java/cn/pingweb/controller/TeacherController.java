package cn.pingweb.controller;

import cn.pingweb.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private ITeacherService teacherService;

    // 创建班级
    public void createClassTS() {
        teacherService.createClassTS();
    }

    // 查看某个学生
    public void checkStudent() {
        teacherService.checkStudent();
    }

    // 查看所有学生
    public void checkAllStudents() {
        teacherService.checkAllStudents();
    }
}
