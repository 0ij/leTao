package com.seu.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seu.springboot.entity.Order;

import java.util.List;

public interface IOrderService extends IService<Order> {
    List<Order> findAllOrders();

    Order addOrder();

    Order updateOrderById(Integer id);

    Integer deleteOrderById(Integer id);


    Order findOrderByGid(Integer gid);

    Order findOrderByOid(Integer oid);
}
