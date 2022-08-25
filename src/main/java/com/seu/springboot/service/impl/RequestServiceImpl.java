package com.seu.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seu.springboot.entity.Evaluation;
import com.seu.springboot.entity.Request;
import com.seu.springboot.mapper.GoodsMapper;
import com.seu.springboot.mapper.RequestMapper;
import com.seu.springboot.service.IRequestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestServiceImpl extends ServiceImpl<RequestMapper, Request> implements IRequestService {

    public List<Request> findAll(){
        QueryWrapper wrapper = new QueryWrapper();

        List<Request> list = this.baseMapper.selectList(wrapper);
        return list;
    }

    @Override
    public List<Request> findAllRequests() {
        QueryWrapper wrapper = new QueryWrapper();

        List<Request> list = this.baseMapper.selectList(wrapper);

        return list;
    }

    ;
}
