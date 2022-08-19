package com.gk.springboot.controller;

import com.gk.springboot.entity.Customer;
import com.gk.springboot.entity.Order;
import com.gk.springboot.service.IOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    IOrderService orderService;

    @GetMapping("/getOrder")
    public List<Order> getOrders(){
        List<Order> orderList = orderService.findAllOrders();
        return orderList;
    }

    @PostMapping("/addOrder")
    public Order addOrder(){
        Order order = orderService.addOrder();
        return order;
    }

    @PostMapping("/updateOrder")
    public Order updateOrderById(Integer id){
        Order order = orderService.updateOrderById(id);
        return order;
    }

    @GetMapping("/deleteOrder")
    public int deleteOrderById(Integer id){
        Integer res = orderService.deleteOrderById(id);
        return res;
    }
}
