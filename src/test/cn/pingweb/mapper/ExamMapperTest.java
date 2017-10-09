package cn.pingweb.mapper;

import cn.pingweb.entity.ExamResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-web.xml"})
public class ExamMapperTest {
    @Autowired
    ExamMapper examMapper;
    @Test
    public void insert() throws Exception {
        ExamResult examResult = new ExamResult( "123", "test", 99, new Date());
        examMapper.insert(examResult);
    }

    @Test
    public void getExamResultByUid() throws Exception {
    }

}