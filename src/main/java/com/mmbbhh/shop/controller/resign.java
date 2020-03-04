package com.mmbbhh.shop.controller;

import com.alibaba.fastjson.JSONObject;
import com.mmbbhh.shop.model.User;
import com.mmbbhh.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resign")
public class resign {
    @Autowired
    UserService userService;
    @PostMapping("")
    public JSONObject getUser(String username, String password, String sex, String tel) {
        JSONObject json = new JSONObject();
        if (userService.ifUserExist(username)) {
            User user = new User();
            user.setUser_name(username);
            user.setUser_phone(tel);
            user.setUser_pwd(password);
            user.setUser_sex(sex);
            userService.add_user(user);
            json.put("state", 1);
            json.put("msg", "注册成功");
        } else {
            json.put("state", 0);
            json.put("msg", "用户已存在");
        }
        return json;
    }
}
