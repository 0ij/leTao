package com.seu.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seu.springboot.entity.ShopSales;
import com.seu.springboot.mapper.ShopSalesMapper;
import com.seu.springboot.service.IShopSalesService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShopSalesServiceImpl extends ServiceImpl<ShopSalesMapper,ShopSales> implements IShopSalesService {

    public List<ShopSales> findAll(){
        QueryWrapper wrapper = new QueryWrapper();

        List<ShopSales> list = this.baseMapper.selectList(wrapper);
        return list;
    };


}
