package com.zxlala.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zxlala.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    public String getName() {
        return "zxlala is a good man!!!";
    }
}
