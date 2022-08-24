package com.seu.springboot.service;

import com.seu.springboot.entity.Customer;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author MisterDong
 * @since 2022-08-24
 */
public interface ICustomerService extends IService<Customer> {

    List<Customer> findAll();

    Customer addCustomer();

    Customer updateCustomerNameById(Integer cid, String name);

    Integer deleteCustomerById(Integer id);
}
