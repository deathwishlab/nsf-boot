package com.netease.cloud.nsf.demo.stock.middleware.web.service;

import com.netease.cloud.nsf.demo.stock.middleware.web.model.UserBean;

import java.util.List;

public interface UserService {
    public List<UserBean> findAll();
}
