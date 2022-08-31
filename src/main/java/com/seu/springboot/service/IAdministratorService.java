package com.seu.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seu.springboot.entity.Administrator;

import java.util.List;

public interface IAdministratorService extends IService<Administrator> {
    List<Administrator> findAll();

    Administrator getByNameAndPassword(String aid, String apassword);
}
