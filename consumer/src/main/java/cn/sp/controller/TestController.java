package cn.sp.controller;

import cn.sp.client.UserClient;
import cn.sp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 2YSP on 2018/4/6.
 */
@Controller
@RequestMapping("user")
public class TestController {

    @Autowired
    private UserClient userClient;

    @ResponseBody
    @GetMapping("test")
    public User test(){
        return userClient.getUser();
    }
}
