package com.gk.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gk.springboot.entity.Evaluation;


import java.util.List;

public interface IEvaluationService extends IService<Evaluation> {

    List<Evaluation> findAllEvaluations();

    Evaluation addEvaluation();
}
