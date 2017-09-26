package cn.pingweb.mapper;

import cn.pingweb.entity.Exam;
import org.apache.ibatis.annotations.Insert;

public interface ExamMapper extends CommonMapper{
    @Insert("insert into Exam(uid,id,score,createTime) values(#{uid},#{id},#{score},#{createTime})")
    public void insert(Exam exam);
}
