package com.seu.springboot.controller;

import com.seu.springboot.entity.Evaluation;
import com.seu.springboot.service.IEvaluationService;
import com.seu.springboot.utils.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/evaluation")
@CrossOrigin
public class EvaluationController {
    @Resource
    IEvaluationService evaluationService;

    @GetMapping("/getEvaluations")
    public R getEvaluationList(){
        return R.ok().data("evaluations",evaluationService.findAllEvaluations());
    }

    @PostMapping("/getEvaluationByOid")
    public R getEvaluationById(Integer oid){
        System.err.println("oid:"+oid);
        List<Evaluation> list=new ArrayList<>();
        list.add(evaluationService.getById(oid));
        return R.ok().data("evaluations",list);
    }

}
