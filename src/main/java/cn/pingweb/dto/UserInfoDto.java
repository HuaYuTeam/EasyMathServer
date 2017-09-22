package cn.pingweb.dto;

import java.util.Date;

public class UserInfoDto {
    private String uid;
    private Date lastTime;

    public UserInfoDto() {
    }

    public UserInfoDto(String uid, Date lastTime) {
        this.uid = uid;
        this.lastTime = lastTime;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }
}
