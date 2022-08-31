package com.seu.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.seu.springboot.entity.Administrator;
import com.seu.springboot.entity.Storekeeper;
import com.seu.springboot.mapper.AdministratorMapper;
import com.seu.springboot.mapper.StorekeeperMapper;
import com.seu.springboot.service.IStorekeeperService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author MisterDong
 * @since 2022-08-17
 */
@Service
public class StorekeeperServiceImpl extends ServiceImpl<StorekeeperMapper, Storekeeper> implements IStorekeeperService {
    @Resource
    @Autowired
    StorekeeperMapper mapper;

    @Override
    public List<Storekeeper> findAll() {
        QueryWrapper<Storekeeper> wrapper = new QueryWrapper<>();
        List<Storekeeper> storekeepers = this.baseMapper.selectList(wrapper);
        return storekeepers;
    }

    @Override
    public Storekeeper getByNameAndPassword(String kid, String kpassword) {
        System.err.println("商家");
        System.err.println("kid"+kid +" kpassword"+kpassword);
        QueryWrapper<Storekeeper> wrapper=new QueryWrapper<>();
        wrapper.eq("Kid",kid).eq("Kpassword",kpassword);
        Storekeeper sk =mapper.selectOne(wrapper);

        return sk;
    }
}
