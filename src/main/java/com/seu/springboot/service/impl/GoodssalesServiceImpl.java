package com.seu.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.seu.springboot.entity.Goodssales;
import com.seu.springboot.mapper.GoodssalesMapper;
import com.seu.springboot.service.IGoodssalesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author MisterDong
 * @since 2022-08-17
 */
@Service
public class GoodssalesServiceImpl extends ServiceImpl<GoodssalesMapper, Goodssales> implements IGoodssalesService {

    @Override
    public List<Goodssales> findAll() {
        QueryWrapper<Goodssales> wrapper = new QueryWrapper<>();
        List<Goodssales> goodssales = this.baseMapper.selectList(wrapper);
        return goodssales;
    }

    @Override
    public List<Goodssales> getGoodsSalesByG(Integer gid) {
        QueryWrapper<Goodssales> wrapper = new QueryWrapper<>();
        wrapper.eq("gid", gid);
        List<Goodssales> goodssales = this.baseMapper.selectList(wrapper);
        return goodssales;
    }

    @Override
    public List<Goodssales> getGoodsSalesByS(Integer sid) {
        QueryWrapper<Goodssales> wrapper = new QueryWrapper<>();
        wrapper.eq("sid", sid);
        List<Goodssales> goodssales = this.baseMapper.selectList(wrapper);
        return goodssales;
    }
}
