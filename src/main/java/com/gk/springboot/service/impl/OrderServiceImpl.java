package com.gk.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gk.springboot.entity.Order;
import com.gk.springboot.mapper.OrderMapper;
import com.gk.springboot.service.IOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>implements IOrderService {
    @Resource
    OrderMapper mapper;

    @Override
    public List<Order> findAllOrders() {
        QueryWrapper wrapper = new QueryWrapper<>();

        List<Order> orderList = this.baseMapper.selectList(wrapper);
        return orderList;
    }

    @Override
    public Order addOrder() {
        Order order = new Order();
        order.setOid(10001);

        mapper.insert(order);
        return order;
    }

    @Override
    public Order updateOrderById(Integer id) {
        Order order = new Order();
        order.setOid(id);
        order.setCid("111");
        order.setAddress("九龙湖动物园");

        mapper.updateById(order);
        return order;
    }

    @Override
    public Integer deleteOrderById(Integer id) {
        mapper.deleteById(id);
        return id;
    }

    @Override
    public Order findOrderById(Integer id) {
//        QueryWrapper<Order>wrapper=new QueryWrapper<>();
//        wrapper.eq("Oid",id);
        Order order= mapper.selectById(id);
        return order;
    }
}
