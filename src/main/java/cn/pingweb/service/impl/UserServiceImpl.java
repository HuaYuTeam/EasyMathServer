package cn.pingweb.service.impl;

import cn.pingweb.entity.User;
import cn.pingweb.mapper.UserMapper;
import cn.pingweb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public void insert(User user) {
        userMapper.insert(user);
    }

    public boolean register(User user) {
        return false;
    }

    public boolean login(User user) {
        return false;
    }

    public boolean logout(User user) {
        return false;
    }

    public User selectRole(User user) {
        return null;
    }
}
