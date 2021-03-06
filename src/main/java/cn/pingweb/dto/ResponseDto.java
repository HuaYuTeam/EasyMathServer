package cn.pingweb.dto;

import cn.pingweb.enums.ResultCode;

import java.util.Map;

/**
 * Created by Administrator on 2017/9/27.
 */
public class ResponseDto {
    private int code;
    private String msg;
    private Map<String, Object> data;

    public ResponseDto() {
    }

    public ResponseDto(int code, String msg, Map<String, Object> data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseDto(int code, String msg) {
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

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public static ResponseDto success(Map<String, Object> map) {
        return new ResponseDto(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), map);
    }

    public static ResponseDto fail() {
        return new ResponseDto(ResultCode.FAIL.getCode(), ResultCode.FAIL.getMsg());
    }

    public static ResponseDto erro() {
        return new ResponseDto(ResultCode.ERRO.getCode(), ResultCode.ERRO.getMsg());
    }

}
