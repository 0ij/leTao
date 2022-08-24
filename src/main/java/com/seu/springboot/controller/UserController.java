package com.seu.springboot.controller;

import com.seu.springboot.entity.Customer;
import com.seu.springboot.utils.R;
import com.seu.springboot.service.ICustomerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Resource
    ICustomerService customerService;

    @PostMapping("/login")
    public R login(String username, String password){
        System.out.println("username = " + username+"  password ="+password);
       Customer customer = customerService.getByNameAndPassword(username,password);
        if(null == customer){
            return R.error().data("前标","内容");
       }else{
            return R.ok().data("前标","内容");
       }

    }

    @GetMapping("/getCustomers")
    public R getCustomers(){
        return R.ok().data("teachers",customerService.findAllCustomers());
    }

    //获取信息接口，传啥啊这
    @GetMapping("/info")
    public R getInfo(String info){
        //返回的roles是这里的内容

        return R.ok().data("roles","[admin]").data("name","一个名字！");
    }
}
