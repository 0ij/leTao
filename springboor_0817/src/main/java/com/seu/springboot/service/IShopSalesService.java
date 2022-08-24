package com.seu.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seu.springboot.entity.ShopSales;

import java.util.List;

public interface IShopSalesService extends IService<ShopSales> {

    List<ShopSales> findAll();
}

