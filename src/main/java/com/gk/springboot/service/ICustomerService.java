package com.gk.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gk.springboot.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ICustomerService extends IService<Customer> {
    List<Customer> findAllCustomers();
    Customer addCustomer();

    Customer updateCustomerNameById(Integer cid,String name);

    int deleteCustomerById(Integer id);

    Customer getByNameAndPassword(String cname,String cpassword);
}
