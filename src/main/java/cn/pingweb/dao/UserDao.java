package cn.pingweb.dao;

import cn.pingweb.Entity.DBObject;
import cn.pingweb.Entity.Exam;
import cn.pingweb.Entity.User;
import cn.pingweb.mapper.CommonMapper;
import cn.pingweb.mapper.ExamMapper;
import cn.pingweb.mapper.UserMapper;
import cn.pingweb.utils.MybatisUtils;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Transactional
@Component
public class UserDao {
//
//    public void insertUser(User user) {
//        SqlSession session=MybatisUtils.getSqlSession();
//        //使用反射的方法
//        UserMapper mapper=session.getMapper(UserMapper.class);
//        mapper.insertT(user);
//    }
//
//    public void insertScore(Exam exam) {
//        SqlSession session=MybatisUtils.getSqlSession();
//        //使用反射的方法
//        ExamMapper mapper=session.getMapper(ExamMapper.class);
//        mapper.insertT(user);
//    }

    public <T> void insertObject(DBObject object) {
        SqlSession session=MybatisUtils.getSqlSession();
        Class<? extends CommonMapper> clazz = object.getMapper();
        CommonMapper  mapper = session.getMapper(clazz);
        mapper.insert(object);

    }


}
