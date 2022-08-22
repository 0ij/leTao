package com.seu.springboot.service;

import com.seu.springboot.entity.Goodssales;
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
public interface IGoodssalesService extends IService<Goodssales> {

    List<Goodssales> findAll();
}
