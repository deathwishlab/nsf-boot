package com.netease.cloud.nsf.demo.stock.middleware.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    @ResponseBody
    public String health() {
        return "hi, I am good!";
    }

}
