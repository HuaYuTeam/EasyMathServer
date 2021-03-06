package cn.pingweb.mapper;

import cn.pingweb.entity.ExamResult;
import cn.pingweb.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ExamMapper {
    @Insert("insert into ExamResult(uid,type,score,createTime) values(#{uid},#{type},#{score},#{createTime})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    public void insert(ExamResult examResult);

    @Delete("delete from ExamResult where uid=#{uid}")
    public void deleteById(String uid);

    @Select("select * from ExamResult where uid=#{uid}")
    public List<ExamResult> getExamResultByUid(String uid);

    @Select("select * from ExamResult")
    public List<ExamResult> getAllExamResults();

}
