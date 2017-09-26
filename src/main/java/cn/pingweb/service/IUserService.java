package cn.pingweb.service;

import cn.pingweb.entity.User;

/**
 * Created by Administrator on 2017/9/26.
 */
public interface IUserService {

    /**
     * 登录
     * @param user
     * @return
     */
    boolean register(User user);

    /**
     * 注册
     * @param user
     * @return
     */
    boolean login(User user);

    /**
     * 退出
     * @param user
     * @return
     */
    boolean logout(User user);

    /**
     * 选择角色
     * @param user
     * @return
     */
    User selectRole(User user);

}
