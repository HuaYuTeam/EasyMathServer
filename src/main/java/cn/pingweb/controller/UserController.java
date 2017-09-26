package cn.pingweb.controller;

import cn.pingweb.dto.ResultDto;
import cn.pingweb.entity.ExamResult;
import cn.pingweb.entity.User;
import cn.pingweb.dto.UserInfoDto;
import cn.pingweb.dto.UserScoreDto;
import cn.pingweb.enums.ResultCode;
import cn.pingweb.exception.ParamException;
import cn.pingweb.exception.WXExcetion;
import cn.pingweb.service.impl.UserServiceImpl;
import com.mysql.fabric.xmlrpc.base.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

//@Controller //@Service @Component
//@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    // 注册
    @RequestMapping(value = "/wx/{wxid}/register",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public UserInfoDto register(@PathVariable("wxid") String wxid) {
        User user = new User("0759", wxid, new Date(), new Date());
        userService.insert(user);
        return new UserInfoDto(user.getUid(), user.getLastTime());
    }

    // 登陆
    @RequestMapping(value = "/wx/{wxid}/score",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public void login() {
        User user = new User();
        userService.login(user);
    }

}
