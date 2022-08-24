package com.gk.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gk.springboot.entity.Goods;
import com.gk.springboot.entity.ShopSales;
import com.gk.springboot.mapper.GoodsMapper;
import com.gk.springboot.mapper.ShopSalesMapper;
import com.gk.springboot.mapper.TeacherMapper;
import com.gk.springboot.service.IGoodsService;
import com.gk.springboot.service.IShopSalesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

    @Resource
    GoodsMapper mapper;
    @Override
    public List<Goods> findAll(){
        QueryWrapper wrapper = new QueryWrapper();

        List<Goods> list = this.baseMapper.selectList(wrapper);
        return list;
    };

}
