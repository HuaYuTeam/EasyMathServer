package cn.pingweb.controller;

import cn.pingweb.Entity.Exam;
import cn.pingweb.Entity.User;
import cn.pingweb.dto.UserInfoDto;
import cn.pingweb.dto.UserScoreDto;
import cn.pingweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

@Controller //@Service @Component
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/wx/{wxid}/register",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public UserInfoDto register(@PathVariable("wxid") String wxid) {
        User user = new User("0759", wxid, new Date(), new Date());
        userService.insert(user);
        return new UserInfoDto(user.getUid(), user.getLastTime());
    }

    @RequestMapping(value = "/wx/{wxid}/score",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public UserScoreDto submitScore(@PathVariable("wxid") String wxid, @RequestBody Map<String, Double> map) {
        Exam exam = new Exam("0759",  wxid, map.get("score"), new Date());
        userService.insert(exam);
        return new UserScoreDto(exam.getScore());
    }

}
