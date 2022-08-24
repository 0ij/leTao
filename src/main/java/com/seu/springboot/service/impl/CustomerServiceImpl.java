package com.seu.springboot.service.impl;

import com.seu.springboot.entity.Customer;
import com.seu.springboot.mapper.CustomerMapper;
import com.seu.springboot.service.ICustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author MisterDong
 * @since 2022-08-24
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Customer addCustomer() {
        return null;
    }

    @Override
    public Customer updateCustomerNameById(Integer cid, String name) {
        return null;
    }

    @Override
    public Integer deleteCustomerById(Integer id) {
        return null;
    }
}
