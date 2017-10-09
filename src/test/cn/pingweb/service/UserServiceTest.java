package cn.pingweb.service;

import cn.pingweb.entity.User;
import cn.pingweb.mapper.UserMapper;
import cn.pingweb.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-web.xml"})
public class UserServiceTest {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert() throws Exception {
        User user = new User("075911", "lzh0759", new Date(), new Date());
//        userService.insert(user);

//        ExamResult exam = new ExamResult("0759",  "zyp", 91.5, new Date());
//        userService.insert(exam);
        userMapper.insert(user);
    }

}