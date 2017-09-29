package cn.pingweb.dao;

import cn.pingweb.entity.DBObject;
import cn.pingweb.mapper.CommonMapper;
import cn.pingweb.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import sun.reflect.ConstructorAccessor;

import java.util.Arrays;

/*
   暂时不用dao，直接mybatis的mapper生成bean
 */
@Transactional
@Component
public class UserDao implements ApplicationContextAware{

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    }
}
