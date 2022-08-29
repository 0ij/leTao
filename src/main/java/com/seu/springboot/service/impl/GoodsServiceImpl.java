package com.seu.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seu.springboot.entity.Goods;
import com.seu.springboot.mapper.GoodsMapper;
import com.seu.springboot.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

    @Resource
    @Autowired
    GoodsMapper mapper;
    @Override
    public List<Goods> findAll(){
        QueryWrapper wrapper = new QueryWrapper();

        List<Goods> list = this.baseMapper.selectList(wrapper);
        return list;
    }

    @Override
    public List<Goods> getGoodsByName(String gname) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("gname", gname);
        List<Goods> list= this.baseMapper.selectList(wrapper);
        System.err.println(list);
        return list;
    }

    ;

}
