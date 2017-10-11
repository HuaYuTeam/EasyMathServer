package cn.pingweb.service;

import cn.pingweb.entity.ExamResult;

import java.util.List;

/**
 * Created by Administrator on 2017/9/26.
 */
public interface ITeacherService {
    // 创建班级
    void createClassTS();

    // 查看某个学生
    void checkStudent();

    // 查看所有学生
    List<ExamResult> checkAllStudents();
}
