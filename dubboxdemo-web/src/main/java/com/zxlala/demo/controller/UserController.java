package com.zxlala.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zxlala.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/showName")
    @ResponseBody
    public String getName(){
        return userService.getName();
    }
}
