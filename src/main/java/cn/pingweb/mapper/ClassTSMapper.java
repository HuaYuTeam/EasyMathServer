package cn.pingweb.mapper;

import cn.pingweb.entity.ClassTS;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

public interface ClassTSMapper extends CommonMapper {
    @Insert("insert into ClassTS(cid,teacherId,num,createTime) values(#{cid},#{teacherId},#{num},#{createTime})")
    public void insert(ClassTS classTS);

    @Update("update ClassTS(cid,teacherId,num,createTime) values(#{cid},#{teacherId},#{num},#{createTime})")
    public void update(ClassTS classTS);

}
