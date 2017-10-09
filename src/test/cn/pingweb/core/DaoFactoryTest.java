package cn.pingweb.core;

import cn.pingweb.entity.User;
import cn.pingweb.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-web.xml"})
public class DaoFactoryTest {

    @Resource
    private UserMapper mapper;

    @Test
    public void testBean() {
        mapper.insert(new User("linZeHua", "4561", new Date(), new Date()));
        System.out.println(mapper);
    }

}