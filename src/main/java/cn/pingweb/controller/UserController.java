package cn.pingweb.controller;

import cn.pingweb.dto.ResponseDto;
import cn.pingweb.entity.User;
import cn.pingweb.exception.WXException;
import cn.pingweb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller //@Service @Component
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    // 注册
    @RequestMapping(value = "/wx/{wxid}/register",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public ResponseDto register(@PathVariable("wxid") String wxid) {
        Map<String, Object> result = new HashMap<String, Object>();
        try{
            User user = new User("0759", wxid, new Date(), new Date());
            userService.register(user);
            result.put("user", user);
        } catch (WXException excetion) {
            return ResponseDto.erro();
        } catch (Exception excetion) {
            return ResponseDto.erro();
        }
        int i = 0;
        return ResponseDto.success(result);
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
