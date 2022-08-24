package com.gk.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gk.springboot.entity.ShopSales;

import java.util.List;

public interface IShopSalesService extends IService<ShopSales> {

    List<ShopSales> findAll();
}

