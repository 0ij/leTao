package com.seu.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seu.springboot.entity.Address;
import com.seu.springboot.mapper.AddressMapper;
import com.seu.springboot.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {
    @Resource
    @Autowired
    AddressMapper mapper;

    @Override
    public List<Address> findAddress(Integer cid) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("cid", cid);
        List<Address> list= this.baseMapper.selectList(wrapper);
        System.err.println(list);
        return list;
    }


}
