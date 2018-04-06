package cn.sp.controller;

import cn.sp.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 2YSP on 2018/4/6.
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("")
    public User getUser(){
        User user = new User();
        user.setId(1);
        user.setName("zhangsan");
        user.setSex("男");
        return user;
    }
}
