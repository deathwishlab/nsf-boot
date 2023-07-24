package com.netease.cloud.nsf.demo.stock.middleware.service.impl;


import com.netease.cloud.nsf.demo.stock.middleware.dao.UserRepository;
import com.netease.cloud.nsf.demo.stock.middleware.model.UserBean;
import com.netease.cloud.nsf.demo.stock.middleware.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public  List<UserBean> findAll(){
        return  userRepository.findAll();
    }
}
