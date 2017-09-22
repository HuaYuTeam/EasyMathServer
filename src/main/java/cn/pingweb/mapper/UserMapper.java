package cn.pingweb.mapper;

import cn.pingweb.Entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper extends CommonMapper {
    @Insert("insert into User(uid,wxid,createTime,lastTime) values(#{uid},#{wxid},#{createTime},#{lastTime})")
    public void insert(User user);

    @Delete("delete from user where id=#{id}")
    public void deleteById(int id);

    @Update("update users set name=#{name},age=#{age} where id=#{id}")
    public void updateT(User user);

    @Select("select * from users where id=#{id}")
    public User getUser(int id);

    @Select("select * from users")
    public List<User> getAllUsers();
}
