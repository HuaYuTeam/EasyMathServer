package cn.pingweb.service;

import cn.pingweb.entity.User;
import cn.pingweb.exception.WXExcetion;

/**
 * Created by Administrator on 2017/9/26.
 */
public interface IUserService {

    /**
     * 登录
     * @param user
     * @return
     */
    void register(User user) throws WXExcetion, Exception;

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
