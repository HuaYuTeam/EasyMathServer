package cn.pingweb.Entity;

import cn.pingweb.mapper.CommonMapper;
import cn.pingweb.mapper.UserMapper;

public interface DBObject {
    public Class<? extends CommonMapper> getMapper();
}
