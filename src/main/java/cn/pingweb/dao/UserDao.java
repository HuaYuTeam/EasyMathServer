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

@Transactional
@Component
public class UserDao implements ApplicationContextAware{

}
