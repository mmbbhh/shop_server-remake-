package com.mmbbhh.shop.controller;

import com.alibaba.fastjson.JSONObject;
import com.mmbbhh.shop.model.Banner;
import com.mmbbhh.shop.model.Recommend;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class home {
    @GetMapping("/Banner")
    public Banner[] banners() {
        Banner [] banner = new Banner[4];
        for (int i = 0; i<4; i++) {
            banner[i] = new Banner();
            banner[i].setId(i+1);
            banner[i].setLink("#");
            Number a = i+1;
            banner[i].setImgUrl("http://123.57.217.239:8889/images/2020/02/27/lb" + a + ".jpg");
        }
        return banner;
    }

    @GetMapping("/Recommend")
    public Recommend [] recommends() {
        Recommend [] recommend = new Recommend[4];
        for (int i = 0; i<4; i++) {
            recommend[i] = new Recommend();
            recommend[i].setLink("#");
            Number a = i+1;
            recommend[i].setImgUrl("http://123.57.217.239:8889/images/2020/02/28/" + a + ".png");
        }
        recommend[0].setTitle("9.9包邮");
        recommend[1].setTitle("特价清仓");
        recommend[2].setTitle("1元福利");
        recommend[3].setTitle("惊喜大礼");
        return recommend;
    }

    @GetMapping("/News")
    public JSONObject news() {
        JSONObject json = new JSONObject();
        json.put("imgUrl", "http://123.57.217.239:8889/images/2020/02/28/view.jpg");
        json.put("link", "#");
        return json;
    }
}
