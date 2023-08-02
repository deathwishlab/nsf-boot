package com.netease.cloud.nsf.demo.stock.middleware.web.controller;

import com.netease.cloud.nsf.demo.stock.middleware.web.model.UserBean;
import com.netease.cloud.nsf.demo.stock.middleware.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    @ResponseBody
    public String findall() {
        List<UserBean> users = userService.findAll();
        String res = "users: ";
        for (UserBean user : users){
            res += user.getName();
        }
        return res;
    }

}
