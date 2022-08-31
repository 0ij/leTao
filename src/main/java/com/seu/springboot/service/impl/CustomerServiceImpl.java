package com.seu.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seu.springboot.entity.Customer;
import com.seu.springboot.mapper.CustomerMapper;
import com.seu.springboot.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {
    @Resource
    @Autowired
    CustomerMapper customerMapper;

    @Override
    public List<Customer> findAllCustomers(){
        QueryWrapper wrapper = new QueryWrapper();

        List<Customer> customerList = this.baseMapper.selectList(wrapper);

        return customerList;
    }


    @Override
    public Customer addCustomer(){
        Customer customer = new Customer();
        customer.setCname("a1a");
        customer.setCpassword("12356");

        int res = customerMapper.insert(customer);

        return customer;
    }

    @Override
    public Customer updateCustomerNameById(Integer cid,String name) {
        Customer customer = new Customer();
        customer.setCid(cid);
        //customer.setCpassword("4444");
        customer.setCname(name);
        customerMapper.updateById(customer);
        return customer;
    }

    @Override
    public int deleteCustomerById(Integer id) {
        customerMapper.deleteById(id);
        return id;
    }

    @Override
    public Customer getByNameAndPassword(String cid,String cpassword) {
        System.err.println("cid"+cid +" cpassword"+cpassword);
        QueryWrapper<Customer> wrapper=new QueryWrapper<>();
        wrapper.eq("Cid",cid).eq("Cpassword",cpassword);
        Customer customer =customerMapper.selectOne(wrapper);

        return customer;
    }
}

