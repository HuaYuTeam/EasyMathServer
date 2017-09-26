package cn.pingweb.enums;

/**
 * Created by Administrator on 2017/9/26.
 */
public enum ResultCode {

    SUCCESS(0, "success"),
    FAIL(-1, "fail"),
    ERRO(-2, "erro");

    private int state;
    private String msg;

    ResultCode(int state, String msg) {
        this.state = state;
        this.msg = msg;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
