package com.gk.springboot.controller;

import com.gk.springboot.entity.Customer;
import com.gk.springboot.utils.R;
import com.gk.springboot.service.ICustomerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Resource
    ICustomerService customerService;

    @PostMapping("/login")
    public R login(String username,String password){
        System.out.println("username = " + username+"  password ="+password);
       Customer customer = customerService.getByNameAndPassword(username,password);
        if(null == customer){
            return R.ok().data("what","f*ck");
       }else{
           return R.error().data("no","no");
       }

    }

    @GetMapping("/getCustomers")
    public R getCustomers(){
        return R.ok().data("teachers",customerService.findAllCustomers());
    }

    //获取信息接口
    @GetMapping("/info")
    public R getInfo(String info){

        return R.ok().data("roles","[admin]").data("name","admin");
    }
}
