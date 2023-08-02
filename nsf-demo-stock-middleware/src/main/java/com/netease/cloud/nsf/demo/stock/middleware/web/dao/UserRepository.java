package com.netease.cloud.nsf.demo.stock.middleware.web.dao;

import com.netease.cloud.nsf.demo.stock.middleware.web.model.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserBean,Long> {

}