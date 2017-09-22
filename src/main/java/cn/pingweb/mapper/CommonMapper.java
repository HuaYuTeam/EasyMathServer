package cn.pingweb.mapper;

import cn.pingweb.Entity.DBObject;

public interface CommonMapper {
    void insert(DBObject object);

    void update(DBObject object);
}
