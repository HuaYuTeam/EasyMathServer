package cn.pingweb.entity;

import cn.pingweb.mapper.CommonMapper;
import cn.pingweb.mapper.ExamMapper;

import java.util.Date;

public class ExamResult {
    private String id;
    private String uid;
    private String type;
    private double score;
    private Date createTime;

    public ExamResult() {
    }

    public ExamResult(String id, String uid, String type, double score, Date createTime) {
        this.id = id;
        this.uid = uid;
        this.type = type;
        this.score = score;
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
}
