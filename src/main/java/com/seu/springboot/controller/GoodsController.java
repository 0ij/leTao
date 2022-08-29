package com.seu.springboot.controller;

import com.seu.springboot.entity.Evaluation;
import com.seu.springboot.entity.Goods;
import com.seu.springboot.service.IGoodsService;

import com.seu.springboot.utils.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Goods")
@CrossOrigin
public class GoodsController {
    @Resource
    IGoodsService service;
    /*
     * 查询的部分
     * */
    @GetMapping("/getGoods")
    public R getGoods(){
        //调用service层函数
        List<Goods> list = service.findAll();
        return R.ok().data("Goods",service.findAll());
    }

    @PostMapping("/getGoodsByID")
    public R getGoodsByID(Integer Gid){
        //System.err.println("Gid: "+Gid );
        List<Goods> list=new ArrayList<>();


        if(service.getById(Gid)==null){
            return R.error();
        }else{
            list.add(service.getById(Gid));
            return R.ok().data("items",list);
        }

    }

    @PostMapping("/getGoodsByName")
    public R getGoodsByName(String Gname){
        System.err.println(Gname);
        List<Goods> list=service.getGoodsByName(Gname);
        if(list == null || list.size () ==0)
            return R.error();
        else
            return R.ok().data("goodsList",list);

    }


    /*
     * 增加的部分
     * */
    @PostMapping("/addGoods")
    public R addGoods(@RequestParam Goods goods){
        boolean mark=service.save(goods);
        if(mark)
            return R.ok();
        return R.error();
    }
    /*
     *  删除的部分
     * */
    @GetMapping("/delGoodsByID")
    public R delGoodsByID(Integer id){

        boolean wre=service.removeById(id);
        if(wre) {
            return R.ok();
        }
        return R.error();

    }
    /*
     * 修改的部分
     * */
    @PostMapping("/updateGoods")
    public R updateGoods(@RequestBody Goods goods){
        boolean mark=service.updateById(goods);
        if(mark)
            return R.ok();
        return R.error();
    };

}


