package com.mmbbhh.shop.controller;

import com.mmbbhh.shop.model.Good;
import com.mmbbhh.shop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class goods {
    @Autowired
    GoodsService goodsService;

    @GetMapping("")
    public List<Good> test(String type,Integer pages) {
        List<Good> selectedGoods = goodsService.selectGoods(type,pages);
        return selectedGoods;
    }

    @GetMapping("/all")
    public List<Good> all() {
        List<Good> allGoods = goodsService.getAllGoods();
        return allGoods;
    }
}
