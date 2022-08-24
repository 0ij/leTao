package com.seu.springboot.service.impl;

import com.seu.springboot.entity.Evaluation;
import com.seu.springboot.mapper.EvaluationMapper;
import com.seu.springboot.service.IEvaluationService;
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
public class EvaluationServiceImpl extends ServiceImpl<EvaluationMapper, Evaluation> implements IEvaluationService {

}
