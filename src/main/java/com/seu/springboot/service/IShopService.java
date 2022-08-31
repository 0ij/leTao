package com.seu.springboot.service;

import com.seu.springboot.entity.Shop;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author MisterDong
 * @since 2022-08-17
 */
public interface IShopService extends IService<Shop> {

    List<Shop> findAll();

    List<Shop> getByName(String name);
}
