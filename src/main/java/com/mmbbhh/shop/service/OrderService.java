package com.mmbbhh.shop.service;

import com.mmbbhh.shop.mapper.OrderMapper;
import com.mmbbhh.shop.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderMapper orderMapper;

    public Boolean add_order(String name, int id, int num) {
        return orderMapper.add_order(name, id, num) != 0;
    }

    public List<Order> order(String name) {
        return orderMapper.order(name);
    }
}
