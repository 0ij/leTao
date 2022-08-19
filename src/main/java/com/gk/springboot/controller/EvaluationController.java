package com.gk.springboot.controller;

import com.gk.springboot.entity.Evaluation;
import com.gk.springboot.service.IEvaluationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/evaluation")
public class EvaluationController {
    @Resource
    IEvaluationService evaluationService;

    @GetMapping("/getEvaluations")
    public List<Evaluation> getEvaluations(){
        List<Evaluation> list =evaluationService.findAllEvaluations();
        return list;

    }
}
