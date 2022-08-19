package com.gk.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gk.springboot.entity.Evaluation;
import com.gk.springboot.mapper.EvaluationMapper;
import com.gk.springboot.service.IEvaluationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EvaluationServiceImpl extends ServiceImpl<EvaluationMapper, Evaluation> implements IEvaluationService {
    @Resource
    EvaluationMapper mapper;


    @Override
    public List<Evaluation> findAllEvaluations() {
        QueryWrapper wrapper = new QueryWrapper();

        List<Evaluation> list = this.baseMapper.selectList(wrapper);

        return list;
    }

    @Override
    public Evaluation addEvaluation(){
        Evaluation evaluation = new Evaluation();
        evaluation.setCid(123);
        evaluation.setOid(99);
        evaluation.setScore(3);
        evaluation.setComment("很好");

        int res = mapper.insert(evaluation);

        return evaluation;
    }


}
