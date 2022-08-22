package com.gk.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gk.springboot.entity.Customer;
import com.gk.springboot.entity.Order;

import java.util.List;

public interface IOrderService extends IService<Order> {
    List<Order> findAllOrders();

    Order addOrder();

    Order updateOrderById(Integer id);

    Integer deleteOrderById(Integer id);

    Order findOrderById(Integer id);
}
