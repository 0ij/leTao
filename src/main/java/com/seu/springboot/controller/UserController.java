package com.seu.springboot.controller;

import com.seu.springboot.entity.Customer;
import com.seu.springboot.entity.Goods;
import com.seu.springboot.utils.R;
import com.seu.springboot.service.ICustomerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Resource
    ICustomerService customerService;

    @PostMapping("/login")
    public R login(String username, String password){
        System.err.println("username = " + username+"  password ="+password);
       Customer customer = customerService.getByNameAndPassword(username,password);
        if(null == customer){
            return R.error();
       }else{
            return R.ok().data("customer",customer);
       }

    }

    @GetMapping("/getCustomers")
    public R getCustomers(){
        return R.ok().data("teachers",customerService.findAllCustomers());
    }

    //获取信息接口，传啥啊这
//    @GetMapping("/info")
//    public R getInfo(String info){
//        //返回的roles是这里的内容
//        //返回用户的对应信息
//
//        return R.ok().data("roles","[admin]").data("name","一个名字！");
//    }

    @GetMapping("/info")
    public R getInfo(Integer cid){
        //返回的roles是这里的内容
        //返回用户的对应信息
        List<Customer> list=new ArrayList<>();


        if(customerService.getById(cid)==null){
            return R.error();
        }else{
            list.add(customerService.getById(cid));
            return R.ok().data("items",list);
        }
       // return R.ok().data("roles","[admin]").data("name","一个名字！");
    }
}
