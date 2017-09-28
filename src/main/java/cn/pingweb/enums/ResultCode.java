package cn.pingweb.enums;

/**
 * Created by Administrator on 2017/9/26.
 */
public enum ResultCode {

    SUCCESS(0, "success"),
    FAIL(-1, "fail"),
    ERRO(-2, "erro");

    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
