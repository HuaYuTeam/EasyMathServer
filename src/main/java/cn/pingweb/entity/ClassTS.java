package cn.pingweb.entity;

public class ClassTS {
    private String cid;
    private String teacherId;
    private int num;

    public ClassTS() {
    }

    public ClassTS(String cid, String teacherId, int num) {
        this.cid = cid;
        this.teacherId = teacherId;
        this.num = num;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
