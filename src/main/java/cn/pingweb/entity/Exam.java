package cn.pingweb.entity;

import cn.pingweb.mapper.CommonMapper;
import cn.pingweb.mapper.ExamMapper;

import java.util.Date;

public class Exam implements DBObject{
    private String uid;
    private String id;
    private double score;
    private Date createTime;

    public Exam() {
    }

    public Exam(String uid, String id, double score, Date createTime) {
        this.uid = uid;
        this.id = id;
        this.score = score;
        this.createTime = createTime;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Class<? extends CommonMapper> getMapper() {
        return ExamMapper.class;
    }
}
