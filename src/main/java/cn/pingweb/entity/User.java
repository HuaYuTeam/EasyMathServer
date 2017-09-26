package cn.pingweb.entity;

import cn.pingweb.mapper.CommonMapper;
import cn.pingweb.mapper.UserMapper;

import java.util.Date;

public class User implements DBObject {
    private String uid;
    private String wxid;
    private Date createTime;
    private Date lastTime;

    public User() {
    }

    public User(String uid, String wxid, Date createTime, Date lastTime) {
        this.uid = uid;
        this.wxid = wxid;
        this.createTime = createTime;
        this.lastTime = lastTime;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getWxid() {
        return wxid;
    }

    public void setWxid(String wxid) {
        this.wxid = wxid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }public Class<? extends CommonMapper> getMapper() {
        return UserMapper.class;
    }
}
