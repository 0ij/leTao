package com.gk.springboot.controller;

import com.gk.springboot.entity.Evaluation;
import com.gk.springboot.service.IEvaluationService;
import com.gk.springboot.utils.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/evaluation")
@CrossOrigin
public class EvaluationController {
    @Resource
    IEvaluationService evaluationService;

   // @GetMapping("/getEvaluations")
    public List<Evaluation> getEvaluations(){
        List<Evaluation> list =evaluationService.findAllEvaluations();
        return list;

    }

    @GetMapping("/getEvaluations")
    public R getEvaluationList(){
        return R.ok().data("evaluations",evaluationService.findAllEvaluations());
    }

    @PostMapping("/getEvaluationByOid")
    public R getEvaluationById(String id){
        System.err.println("id:"+id);
        return R.ok().data("evaluations",evaluationService.findEvaluationById(id));
    }

}
