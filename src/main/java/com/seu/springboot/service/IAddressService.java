package com.seu.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seu.springboot.entity.Address;
import com.seu.springboot.entity.Administrator;

import java.util.List;

public interface IAddressService extends IService<Address> {

    List<Address> findAddress(Integer cid);
}
