package com.seu.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seu.springboot.entity.Request;

import java.util.List;

public interface IRequestService extends IService<Request> {
    List<Request> findAll();

}

