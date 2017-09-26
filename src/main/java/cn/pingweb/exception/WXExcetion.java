package cn.pingweb.exception;

public class WXExcetion extends Exception {

    public WXExcetion(String message) {
        super(message);
    }

    public WXExcetion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
