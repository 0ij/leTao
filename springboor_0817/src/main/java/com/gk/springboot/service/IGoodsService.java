package com.gk.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gk.springboot.entity.Goods;


import java.util.List;

public interface IGoodsService extends IService<Goods> {

    List<Goods> findAll();
}
