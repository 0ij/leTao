package com.seu.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seu.springboot.entity.Goods;


import java.util.List;

public interface IGoodsService extends IService<Goods> {

    List<Goods> findAll();

    List<Goods> getGoodsByName(String name);
}
