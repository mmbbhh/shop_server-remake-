package com.mmbbhh.shop.service;

import com.mmbbhh.shop.mapper.CategoryMapper;
import com.mmbbhh.shop.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//分类相关的服务层
@Service
public class CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    /*public List<Good> getAllGoods() {
        return goodsMapper.getAllGoods();
    }*/
    public List<Category> getCategory() {
        return categoryMapper.getCategory();
    }
}