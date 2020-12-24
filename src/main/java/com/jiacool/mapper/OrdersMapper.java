package com.jiacool.mapper;

import com.jiacool.domain.Orders;

import java.util.List;

//订单
public interface OrdersMapper {
    //查询所有的订单 包含orders表和user表
    List<Orders> findAll();
}
