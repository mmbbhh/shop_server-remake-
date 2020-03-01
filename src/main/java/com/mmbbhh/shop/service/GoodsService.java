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
    /*public List<Good> getAllGoods() {
        return goodsMapper.getAllGoods();
    }*/
    public List<Good> selectGoods(String type,Integer pages) {
        int start = pages - 1;
        int end = pages * 20;
        return goodsMapper.mainGoods(type,start,end);
    }
    public Good selectGoodById(Integer id) {
        return goodsMapper.selectGoodById(id);
    }
    public List<Good> randomGoods(Integer page) {
        List<Good> result = goodsMapper.randomGoods();
        return result.subList(page - 1, page * 20);
    }
}
