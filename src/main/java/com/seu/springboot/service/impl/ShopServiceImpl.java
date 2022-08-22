package com.seu.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.seu.springboot.entity.Shop;
import com.seu.springboot.mapper.ShopMapper;
import com.seu.springboot.service.IShopService;
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
public class ShopServiceImpl extends ServiceImpl<ShopMapper, Shop> implements IShopService {

    @Override
    public List<Shop> findAll() {
        QueryWrapper<Shop> wrapper = new QueryWrapper<>();
        List<Shop> shops = this.baseMapper.selectList(wrapper);
        return shops;
    }
}
