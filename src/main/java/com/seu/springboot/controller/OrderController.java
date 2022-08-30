package com.seu.springboot.controller;


import com.seu.springboot.entity.Evaluation;
import com.seu.springboot.entity.Order;
import com.seu.springboot.service.IOrderService;
import com.seu.springboot.utils.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {
    @Resource
    IOrderService orderService;

    @GetMapping("/getOrders")
    public R getOrderList(){
        //String s= gson.toJson(orderService.findAllOrders());
        return R.ok().data("orders",orderService.findAllOrders());
    }

    @PostMapping("/getOrderByOid")
    //@CrossOrigin(origins = {"*","null"})
    public R getOrderByOid( Integer oid){
        System.err.println("oid-------->"+oid);
        List<Order> list=new ArrayList<>();
        list.add(orderService.getById(oid));
        return R.ok().data("orders",list);
    }

    @PostMapping("/getOrderByGid")
    public R getOrderByGid(int gid){
        List<Order> list =new ArrayList<>();
        list.add(orderService.findOrderByGid(gid));
        return R.ok().data("orders",list);
    }

    @PostMapping("/addOrder")
    public Order addOrder(){
        Order order = orderService.addOrder();
        return order;
    }

    @PostMapping("/updateOrder")
    public Order updateOrderById(@RequestBody Integer id){
        Order order = orderService.updateOrderById(id);
        return order;
    }

    @GetMapping("/deleteOrder")
    public int deleteOrderById(@RequestBody Integer id){
        Integer res = orderService.deleteOrderById(id);
        return res;
    }
}
