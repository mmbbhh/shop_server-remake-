package com.mmbbhh.shop.mapper;

import com.mmbbhh.shop.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface OrderMapper {
    //添加购买记录
    int add_order(String name,int id,int num);
    //查询购买记录
    List<Order> order(String name);
}
