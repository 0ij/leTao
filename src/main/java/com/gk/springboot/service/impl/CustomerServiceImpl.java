package com.gk.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gk.springboot.entity.Customer;
import com.gk.springboot.mapper.CustomerMapper;
import com.gk.springboot.service.ICustomerService;
import com.gk.springboot.utils.R;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper,Customer> implements ICustomerService {
    @Resource
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
        customer.setName("a1a");
        customer.setCpassword("12356");

        int res = customerMapper.insert(customer);

        return customer;
    }

    @Override
    public Customer updateCustomerById(Integer id) {
        Customer customer = new Customer();
        customer.setCid(id);
        customer.setCpassword("4444");
        customerMapper.updateById(customer);
        return customer;
    }

    @Override
    public int deleteCustomerById(Integer id) {
        customerMapper.deleteById(id);
        return id;
    }

    @Override
    public Customer getByNameAndPassword(String cname,String cpassword) {
        QueryWrapper<Customer> wrapper=new QueryWrapper<>();
        wrapper.eq("Cname",cname).eq("Cpassword",cpassword);
        Customer customer =customerMapper.selectOne(wrapper);

        return customer;
    }
}

