package com.mmbbhh.shop.controller;

import com.alibaba.fastjson.JSONObject;
import com.mmbbhh.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/collect")
public class collect {
    @Autowired
    UserService userService;
    @GetMapping("")
    public JSONObject hello() {
        JSONObject json = new JSONObject();
        json.put("msg", "hello");
        return json;
    }
}
