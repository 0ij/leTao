package com.seu.springboot.service;

import com.seu.springboot.entity.Customer;
import com.baomidou.mybatisplus.extension.service.IService;
import com.seu.springboot.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author MisterDong
 * @since 2022-08-24
 */
@Service
public interface ICustomerService extends IService<Customer> {
    List<Customer> findAll();

    Customer addCustomer();

    Customer updateCustomerNameById(Integer cid, String name);

    Integer deleteCustomerById(Integer id);

    Customer getByName(String cname);

    Customer get(String cname, String cpassword);
}
