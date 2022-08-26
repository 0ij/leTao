package com.seu.springboot.controller;


import com.seu.springboot.entity.Customer;
import com.seu.springboot.service.ICustomerService;
import com.seu.springboot.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author MisterDong
 * @since 2022-08-24
 */
@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    ICustomerService customerService;

    @GetMapping("/getCustomers")
    public R getCustomers() {
        return R.ok().data("customers", customerService.findAll());
    }

    @PostMapping("/addCustomer")
    public Customer addCustomer(){
        Customer customer = customerService.addCustomer();
        return customer;
    }

    @PostMapping("/updateCustomerName")
    public Customer updateCustomerNameById(Integer cid,String name){
        System.err.print("函数调用");
        System.err.print("cid:"+cid);
        System.err.print("name:"+name);
        Customer customer = customerService.updateCustomerNameById(cid,name);
        return customer;
    }

    @GetMapping("/deleteCustomer")
    public int deleteCustomerById(Integer id){
        Integer res = customerService.deleteCustomerById(id);
        return res;
    }

    @PostMapping("/login")
    public R login(@RequestBody Customer customer) {
        String cname = customer.getCname();
        cname = HtmlUtils.htmlEscape(cname);
        Customer cus = customerService.get(cname, customer.getCpassword());
        if(cus == null) {
            return R.error();
        } else {
            return R.ok();
        }
    }

}
