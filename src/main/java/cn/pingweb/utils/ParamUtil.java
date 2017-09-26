package cn.pingweb.utils;

import cn.pingweb.exception.ParamException;

import java.util.Map;

/**
 * Created by Administrator on 2017/9/26.
 */
public class ParamUtil {

    public static String getString(Map<String, Object> map) {
        return null;
    }

    public static <T> T getValue(Map<String, Object> paramMap, String key) throws ParamException {
        return (T) paramMap.get(key);
    }

}
