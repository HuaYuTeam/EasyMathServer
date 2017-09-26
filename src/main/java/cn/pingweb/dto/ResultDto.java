package cn.pingweb.dto;

import cn.pingweb.enums.ResultCode;

/**
 * Created by Administrator on 2017/9/26.
 */
public class ResultDto {
    private ResultCode resultCode;
    private Object object;

    public ResultDto(ResultCode resultCode, Object object) {
        this.resultCode = resultCode;
        this.object = object;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }

    public void setResultCode(ResultCode resultCode) {
        this.resultCode = resultCode;
    }

    public Object getObject() {
        return object;
    }

    public ResultDto(ResultCode resultCode) {
        this.resultCode = resultCode;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
