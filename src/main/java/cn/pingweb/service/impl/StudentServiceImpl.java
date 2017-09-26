package cn.pingweb.service.impl;

import cn.pingweb.mapper.ClassTSMapper;
import cn.pingweb.mapper.ExamMapper;
import cn.pingweb.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/9/26.
 */
@Service
public class StudentServiceImpl {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ExamMapper examMapper;

    @Autowired
    private ClassTSMapper classTSMapper;
}
