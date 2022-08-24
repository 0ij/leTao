package com.seu.springboot.controller;

import com.seu.springboot.entity.Order;
import com.seu.springboot.service.IOrderService;
import com.seu.springboot.utils.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {
    @Resource
    IOrderService orderService;

//    @GetMapping("/getOrder")
//    public List<Order> getOrders(){
//        List<Order> orderList = orderService.findAllOrders();
//        return orderList;
//    }

    @GetMapping("/getOrders")
    public R getOrderList(){
        return R.ok().data("orders",orderService.findAllOrders());
    }


    @PostMapping("/getOrderByOid")
    @CrossOrigin
    public R getOrderByOid( Integer oid){
        System.err.println("oid-------->"+oid);
        return R.ok().data("orders",orderService.findOrderByOid(oid));
    }

    @PostMapping("/getOrderByGid")
    public R getOrderByGid(int gid){
        return R.ok().data("orders",orderService.findOrderByGid(gid));
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
