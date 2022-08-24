package com.gk.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gk.springboot.entity.Goods;
import com.gk.springboot.entity.Request;
import com.gk.springboot.entity.ShopSales;

import java.util.List;

public interface IRequestService extends IService<Request> {
    List<Request> findAll();

}

