package com.gk.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gk.springboot.entity.Goods;
import com.gk.springboot.entity.Request;
import com.gk.springboot.mapper.GoodsMapper;
import com.gk.springboot.mapper.RequestMapper;
import com.gk.springboot.service.IGoodsService;
import com.gk.springboot.service.IRequestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestServiceImpl extends ServiceImpl<RequestMapper, Request> implements IRequestService {

    public List<Request> findAll(){
        QueryWrapper wrapper = new QueryWrapper();

        List<Request> list = this.baseMapper.selectList(wrapper);
        return list;
    };
}
