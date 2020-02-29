package com.mmbbhh.shop.service;

import com.mmbbhh.shop.mapper.GoodsMapper;
import com.mmbbhh.shop.model.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//商品相关的服务层
@Service
public class GoodsService {
    @Autowired
    GoodsMapper goodsMapper;
    public List<Good> getAllGoods() {
        return goodsMapper.getAllGoods();
    }
    public List<Good> selectGoods(String type,Integer pages) {
        int start = pages - 1;
        int end = pages * 20;
        return goodsMapper.selectGoods(type,start,end);
    }
}
