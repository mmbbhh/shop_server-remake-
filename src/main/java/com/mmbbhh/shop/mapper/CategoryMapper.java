package com.mmbbhh.shop.mapper;

import com.mmbbhh.shop.model.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//商品分类相关映射器
@Mapper
@Repository
public interface CategoryMapper {
    List<Category> getCategory();
}
