package cn.pingweb.controller;

import cn.pingweb.dto.ResponseDto;
import cn.pingweb.entity.User;
import cn.pingweb.exception.WXExcetion;
import cn.pingweb.service.IUserService;
import cn.pingweb.utils.WXUtils;
import com.sun.jndi.toolkit.url.Uri;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.MalformedURLException;
import java.net.URI;
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
        } catch (WXExcetion excetion) {
            return ResponseDto.erro();
        } catch (Exception excetion) {
            return ResponseDto.erro();
        }
        int i = 0;
        return ResponseDto.success(result);
    }

    // 登陆
    @RequestMapping(value = "/wx/{wxid}/onlogin",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Object login() throws MalformedURLException {
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=wx9bd1e6712120a747&secret=8300c178a5e5e4aef0a6cefff5f1d245&js_code=JSCODE&grant_type=authorization_code";
        return WXUtils.doGet(url,"utf-8");
    }

}
