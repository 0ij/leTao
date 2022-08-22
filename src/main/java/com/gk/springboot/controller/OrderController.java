package com.gk.springboot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gk.springboot.entity.Customer;
import com.gk.springboot.entity.Order;
import com.gk.springboot.service.IOrderService;
import com.gk.springboot.utils.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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

    @CrossOrigin
    @PostMapping("/getOrderByOid")
    public R getOrderByOid(@RequestParam Integer oid){
        System.err.println("oid-------->"+oid);
        return R.ok().data("orders",orderService.findOrderByOid(oid));
    }

    @GetMapping("/getOrderByGid")
    public R getOrderByGid(@RequestBody int gid){
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
