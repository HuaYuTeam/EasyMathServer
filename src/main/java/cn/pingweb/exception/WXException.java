package cn.pingweb.exception;

public class WXException extends Exception {

    public WXException(String message) {
        super(message);
    }

    public WXException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
