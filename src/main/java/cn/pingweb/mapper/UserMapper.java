package cn.pingweb.mapper;

import cn.pingweb.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper extends CommonMapper {
    @Insert("insert into User(uid,wxid,createTime,lastTime) values(#{uid},#{wxid},#{createTime},#{lastTime})")
    public void insert(User user);

    @Delete("delete from User where uid=#{uid}")
    public void deleteById(String uid);

    @Update("update User set wxid=#{wxid},lastTime=#{lastTime} where uid=#{uid}")
    public void updateT(User user);

    @Select("select * from User where uid=#{uid}")
    public User getUser(String uid);

    @Select("select * from User")
    public List<User> getAllUsers();
}
