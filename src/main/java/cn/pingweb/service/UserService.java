package cn.pingweb.service;

import cn.pingweb.entity.DBObject;
import cn.pingweb.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void insert(DBObject object) {
        userDao.insertObject(object);
    }

}
