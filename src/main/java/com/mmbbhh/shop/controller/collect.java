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
    public JSONObject ifLike(String user,int id) {
        JSONObject json = new JSONObject();
        if (!userService.ifLike(user, id)) {
            json.put("state", 1);
        } else {
            json.put("state", 0);
        }
        return json;
    }

    @GetMapping("/like")
    public JSONObject like(String user,int id) {
        JSONObject json = new JSONObject();
        if (userService.add_collect(user, id)) {
            json.put("state", 1);
        } else {
            json.put("state", 0);
        }
        return json;
    }

    @GetMapping("/dislike")
    public JSONObject dislike(String user,int id) {
        JSONObject json = new JSONObject();
        if (userService.delete_collect(user, id)) {
            json.put("state", 1);
        } else {
            json.put("state", 0);
        }
        return json;
    }

    @GetMapping("/all")
    public JSONObject all(String user) {
        JSONObject json = new JSONObject();
        json.put("state", 1);
        json.put("data", userService.get_collections(user));
        return json;
    }
}
