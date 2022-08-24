package com.gk.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gk.springboot.entity.Administrator;
import com.gk.springboot.entity.Request;

import java.util.List;

public interface IAdministratorService extends IService<Administrator> {
    List<Administrator> findAll();
}
