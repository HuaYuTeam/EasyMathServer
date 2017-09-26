package cn.pingweb.mapper;

import cn.pingweb.entity.ExamResult;
import cn.pingweb.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ExamMapper {
    @Insert("insert into ExamResult(uid,id,type,score,createTime) values(#{uid},#{type},#{uid},#{score},#{createTime})")
    public void insert(ExamResult examResult);

    @Delete("delete from ExamResult where uid=#{uid}")
    public void deleteById(String uid);

    @Select("select * from ExamResult where uid=#{uid}")
    public ExamResult getExamResultByUid(String uid);

    @Select("select * from ExamResult")
    public List<ExamResult> getAllExamResults();

}
