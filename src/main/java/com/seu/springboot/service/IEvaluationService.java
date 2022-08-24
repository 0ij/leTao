package com.seu.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seu.springboot.entity.Evaluation;


import java.util.List;

public interface IEvaluationService extends IService<Evaluation> {

    List<Evaluation> findAllEvaluations();

    Evaluation addEvaluation();

    Evaluation findEvaluationById(String id);
}
