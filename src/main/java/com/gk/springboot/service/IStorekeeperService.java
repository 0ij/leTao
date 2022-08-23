package com.gk.springboot.service;

import com.gk.springboot.entity.Storekeeper;
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
public interface IStorekeeperService extends IService<Storekeeper> {

    List<Storekeeper> findAll();
}
