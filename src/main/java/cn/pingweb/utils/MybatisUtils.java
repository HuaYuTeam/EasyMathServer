package cn.pingweb.utils;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


public class MybatisUtils implements InitializingBean {

    private static SqlSessionFactory sqlSessionFactory;

    private static SqlSession sqlSession;

    public static SqlSessionFactory getFactory(){
        return sqlSessionFactory;
    }

    public static SqlSession getSqlSession() {
        return sqlSession;
    }

    private void load() {
        String resource="mybatis.xml";
        //加载mybatis 的配置文件（它也加载关联的映射文件）
        InputStream is=MybatisUtils.class.getClassLoader().getResourceAsStream(resource);
        //构建sqlSession 的工厂
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        this.sqlSession = sqlSessionFactory.openSession(true);
    }

    public void afterPropertiesSet() throws Exception {
        load();
    }
}
