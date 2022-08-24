package com.seu.springboot.service.impl;

import com.seu.springboot.entity.Request;
import com.seu.springboot.mapper.RequestMapper;
import com.seu.springboot.service.IRequestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author MisterDong
 * @since 2022-08-24
 */
@Service
public class RequestServiceImpl extends ServiceImpl<RequestMapper, Request> implements IRequestService {

}
