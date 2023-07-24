package com.netease.cloud.nsf.demo.stock.middleware.service;

import com.netease.cloud.nsf.demo.stock.middleware.model.UserBean;

import java.util.List;

public interface UserService {
    public List<UserBean> findAll();
}
