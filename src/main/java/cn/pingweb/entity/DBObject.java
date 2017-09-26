package cn.pingweb.entity;

import cn.pingweb.mapper.CommonMapper;

public interface DBObject {
    public Class<? extends CommonMapper> getMapper();
}
