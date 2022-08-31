package com.seu.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seu.springboot.entity.Customer;

import java.util.List;


public interface ICustomerService extends IService<Customer> {
    List<Customer> findAllCustomers();
    Customer addCustomer();

    Customer updateCustomerNameById(Integer cid,String name);

    int deleteCustomerById(Integer id);

    Customer getByNameAndPassword(String cid,String cpassword);
}
