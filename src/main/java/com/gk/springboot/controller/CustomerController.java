package com.gk.springboot.controller;

import com.gk.springboot.entity.Customer;
import com.gk.springboot.service.ICustomerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {
    @Resource
    ICustomerService customerService;

    @GetMapping("/getCustomers")
    public List<Customer> getCustomers(){
        List <Customer> customerList =customerService.findAllCustomers();
        return customerList;
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
}
