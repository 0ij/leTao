package com.gk.springboot.controller;

import com.gk.springboot.entity.Customer;
import com.gk.springboot.service.ICustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/customer")
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

    @PostMapping("/updateCustomer")
    public Customer updateCustomerById(Integer id){
        Customer customer = customerService.updateCustomerById(id);
        return customer;
    }

    @GetMapping("/deleteCustomer")
    public int deleteCustomerById(Integer id){
        Integer res = customerService.deleteCustomerById(id);
        return res;
    }
}
