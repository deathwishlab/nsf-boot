package com.netease.cloud.nsf.demo.stock.middleware.web.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RedisTestController {

    @Resource
    private RedisTemplate redisTemplate;

    @GetMapping("/redis/get")
    @ResponseBody
    public String redis_get() {
        redisTemplate.opsForValue().set("nsftest","helloredis");
        String msg = redisTemplate.opsForValue().get("nsftest").toString();
        System.out.println("\r\nredis recive message:" + msg);
        return "hi, I am good!" + msg;
    }

}
