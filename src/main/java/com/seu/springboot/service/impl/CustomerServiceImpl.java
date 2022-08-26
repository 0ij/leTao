package com.seu.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.seu.springboot.entity.Customer;
import com.seu.springboot.entity.Shop;
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
        QueryWrapper<Customer> wrapper = new QueryWrapper<>();
        List<Customer> customers = this.baseMapper.selectList(wrapper);
        return customers;
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
    @Override
    public Customer getByName(String cname) {
        return this.baseMapper.findByCname(cname);
    }
    @Override
    public Customer get(String cname, String cpassword){
        return this.baseMapper.getByCnameAndCpassword(cname, cpassword);
    }
}
