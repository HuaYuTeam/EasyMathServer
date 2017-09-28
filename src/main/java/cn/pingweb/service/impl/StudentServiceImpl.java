package cn.pingweb.service.impl;

import cn.pingweb.entity.Student;
import cn.pingweb.mapper.ClassTSMapper;
import cn.pingweb.mapper.ExamMapper;
import cn.pingweb.mapper.StudentMapper;
import cn.pingweb.mapper.UserMapper;
import cn.pingweb.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/9/26.
 */
@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private ExamMapper examMapper;

    @Autowired
    private ClassTSMapper classTSMapper;

    public void joinClassTS() {

    }

    public void submitExam() {

    }
}
