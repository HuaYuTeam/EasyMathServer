package cn.pingweb.service;

import cn.pingweb.Entity.Exam;
import cn.pingweb.Entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-web.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void insert() throws Exception {
//        User user = new User("0759", "zyp0759", new Date(), new Date());
//        userService.insert(user);
        Exam exam = new Exam("0759",  "zyp", 91.5, new Date());
        userService.insert(exam);
    }

}