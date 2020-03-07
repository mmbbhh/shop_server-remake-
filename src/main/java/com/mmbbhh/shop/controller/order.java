package com.mmbbhh.shop.controller;

import com.alibaba.fastjson.JSONObject;
import com.mmbbhh.shop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class order {
    @Autowired
    OrderService orderService;
    @GetMapping("")
    public JSONObject my_order(String user) {
        JSONObject json = new JSONObject();
        json.put("state", 1);
        json.put("data", orderService.order(user));
        return json;
    }

    @GetMapping("/add")
    public JSONObject add(String user,int id, int num) {
        JSONObject json = new JSONObject();
        if (orderService.add_order(user, id, num)) {
            json.put("state", 1);
        } else {
            json.put("state", 0);
        }
        return json;
    }
}
