package cn.pingweb.exception;

/**
 * Created by Administrator on 2017/9/26.
 */
public class ParamException extends Exception {
    public ParamException(String message) {
        super(message);
    }

    protected ParamException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
