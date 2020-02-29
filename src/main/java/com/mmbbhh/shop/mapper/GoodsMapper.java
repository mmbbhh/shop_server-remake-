package com.mmbbhh.shop.mapper;

import com.mmbbhh.shop.model.Good;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//商品mybatis相关映射器
@Mapper
@Repository
public interface GoodsMapper {
    List<Good> selectGoods(String type,Integer start,Integer end);
    List<Good> getAllGoods();
}
