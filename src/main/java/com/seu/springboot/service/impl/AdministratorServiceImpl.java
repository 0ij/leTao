package com.seu.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.seu.springboot.entity.Administrator;
import com.seu.springboot.mapper.AdministratorMapper;
import com.seu.springboot.mapper.GoodsMapper;
import com.seu.springboot.service.IAdministratorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author MisterDong
 * @since 2022-08-24
 */
@Service
public class AdministratorServiceImpl extends ServiceImpl<AdministratorMapper, Administrator> implements IAdministratorService {

    @Resource
    AdministratorMapper mapper;

    @Override
    public List<Administrator> findAll(){
        QueryWrapper wrapper = new QueryWrapper();

        List<Administrator> list = this.baseMapper.selectList(wrapper);
        return list;
    };
}
