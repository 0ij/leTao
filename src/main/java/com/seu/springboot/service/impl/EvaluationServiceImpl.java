package com.seu.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seu.springboot.entity.Evaluation;
import com.seu.springboot.mapper.EvaluationMapper;
import com.seu.springboot.service.IEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EvaluationServiceImpl extends ServiceImpl<EvaluationMapper, Evaluation> implements IEvaluationService {
    @Resource
    @Autowired
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

    @Override
    public Evaluation findEvaluationById(String id) {
        QueryWrapper<Evaluation> wrapper=new QueryWrapper<>();
        wrapper.eq("Oid",id);
        Evaluation evaluation =mapper.selectOne(wrapper);
        return evaluation;
    }


}
