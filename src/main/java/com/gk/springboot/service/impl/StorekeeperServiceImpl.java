package com.gk.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gk.springboot.entity.Shop;
import com.gk.springboot.entity.Storekeeper;
import com.gk.springboot.mapper.StorekeeperMapper;
import com.gk.springboot.service.IStorekeeperService;
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
public class StorekeeperServiceImpl extends ServiceImpl<StorekeeperMapper, Storekeeper> implements IStorekeeperService {

    @Override
    public List<Storekeeper> findAll() {
        QueryWrapper<Storekeeper> wrapper = new QueryWrapper<>();
        List<Storekeeper> storekeepers = this.baseMapper.selectList(wrapper);
        return storekeepers;
    }
}
