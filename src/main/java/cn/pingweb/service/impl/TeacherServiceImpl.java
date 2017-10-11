package cn.pingweb.service.impl;

import cn.pingweb.entity.ClassTS;
import cn.pingweb.entity.ExamResult;
import cn.pingweb.mapper.ClassTSMapper;
import cn.pingweb.mapper.ExamMapper;
import cn.pingweb.mapper.UserMapper;
import cn.pingweb.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/9/26.
 */
@Service
public class TeacherServiceImpl implements ITeacherService{
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ExamMapper examMapper;

    @Autowired
    private ClassTSMapper classTSMapper;

    public void createClassTS() {

    }

    public void checkStudent() {

    }

    public List<ExamResult> checkAllStudents() {
        return  examMapper.getAllExamResults();
    }
}
