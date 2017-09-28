package cn.pingweb.entity;

/**
 * Created by Administrator on 2017/9/27.
 */
public class Student {
    private String uid;
    private String tid;

    public Student() {
    }

    public Student(String uid, String tid) {
        this.uid = uid;
        this.tid = tid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }
}
