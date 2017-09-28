package cn.pingweb.mapper;

import cn.pingweb.entity.ClassTS;
import cn.pingweb.entity.Student;
import cn.pingweb.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2017/9/27.
 */
public interface StudentMapper {
    @Insert("insert into Student(uid,cid) values(#{uid},#{cid})")
    public void insert(Student student);

    @Select("select * Student(uid,cid) where(uid=#{uid})")
    public Student getStudent(Student student);

    @Select("select * Student(uid,cid) where(cid=#{cid})")
    public List<Student> getStudentsByClass(ClassTS classTS);


}
