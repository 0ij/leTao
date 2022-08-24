package com.gk.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gk.springboot.entity.Administrator;
import com.gk.springboot.entity.Goods;
import com.gk.springboot.mapper.AdministratorMapper;
import com.gk.springboot.mapper.GoodsMapper;
import com.gk.springboot.service.IAdministratorService;
import com.gk.springboot.service.IGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdministratorImpl extends ServiceImpl<AdministratorMapper, Administrator> implements IAdministratorService {
    @Resource
    GoodsMapper mapper;
    @Override
    public List<Administrator> findAll(){
        QueryWrapper wrapper = new QueryWrapper();

        List<Administrator> list = this.baseMapper.selectList(wrapper);
        return list;
    };
}
