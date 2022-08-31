package com.seu.springboot.controller;

import com.seu.springboot.entity.Administrator;
import com.seu.springboot.entity.Customer;
import com.seu.springboot.entity.Goods;
import com.seu.springboot.entity.Storekeeper;
import com.seu.springboot.service.IAdministratorService;
import com.seu.springboot.service.IStorekeeperService;
import com.seu.springboot.utils.R;
import com.seu.springboot.service.ICustomerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Resource
    ICustomerService customerService;
    @Resource
    IStorekeeperService storekeeperService;
    @Resource
    IAdministratorService adminService;

    //登录都是用户
    @PostMapping("/login")
    public R login(String userid, String password,String value){
        System.err.println("userid = " + userid+"  password ="+password+" value = "+value);
        if(Objects.equals(value, "customer")){
            System.err.println("消费者登录");
            Customer customer = customerService.getByNameAndPassword(userid,password);
            if(null == customer){
                return R.error();
            }else{
                return R.ok().data("customer",customer);
            }
        }else if(Objects.equals(value, "admin"))
        {
            System.err.println("管理员登录");
            Administrator admin= adminService.getByNameAndPassword(userid,password);
            if(null == admin){
                return R.error();
            }else{
                return R.ok().data("admin",admin);
            }
        }else if(Objects.equals(value, "storekeeper")){
            System.err.println("商家登录");
            Storekeeper storekeeper = storekeeperService.getByNameAndPassword(userid,password);
            if(null == storekeeper){
                return R.error();
            }else{
                return R.ok().data("storekeeper",storekeeper);
            }
        }else{
            System.err.println("无类型");
            return R.error();
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
