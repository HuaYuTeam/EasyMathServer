package cn.pingweb.core;

import cn.pingweb.dao.UserDao;
import cn.pingweb.mapper.CommonMapper;
import cn.pingweb.mapper.UserMapper;
import cn.pingweb.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

public class DaoFactory implements IDaoFactory, ApplicationContextAware, InitializingBean {
    private ApplicationContext applicationContext;
    private Map<String, Object> daoMap = new HashMap<String, Object>();
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }


    public void afterPropertiesSet() throws Exception {
        load();
    }

    private void load() {
//        daoMap = applicationContext.getBeansWithAnnotation(Dao.class);
//        SqlSession session= MybatisUtils.getSqlSession();
//        Class<? extends CommonMapper> clazz = object.getMapper();
//        CommonMapper  mapper = session.getMapper(clazz);
//        mapper.update(object);
        ConfigurableApplicationContext context = (ConfigurableApplicationContext)  applicationContext;
        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) context.getBeanFactory();
        BeanDefinitionBuilder bdb = BeanDefinitionBuilder
                .rootBeanDefinition(UserMapper.class);
        bdb.setScope("prototype");
        beanFactory.registerBeanDefinition("mapper",
                bdb.getBeanDefinition());
    }


    public Object getBean() {
        return null;
    }
}
