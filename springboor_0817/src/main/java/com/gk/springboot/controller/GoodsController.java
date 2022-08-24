package com.gk.springboot.controller;

import com.gk.springboot.entity.Goods;
import com.gk.springboot.entity.Request;
import com.gk.springboot.entity.ShopSales;
import com.gk.springboot.service.IGoodsService;

import com.gk.springboot.utils.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
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
    public R getShopSales(){

        //调用service层函数
        List<Goods> list = service.findAll();

        //System.err.println("list--------->"+list);
        //return  list;
        return R.ok().data("Goods",service.findAll());
    }

    @GetMapping("/getGoodsByID")
    public R getGoodsByID( Integer id){
        Goods a_good=service.getById(id);


        return R.ok().data("items",a_good);
    }

//    @GetMapping("/getGoodsByName")
//    public R getGoodsByName(String name){
//        Goods a_good=service.getByName(name);
//
//
//        return R.ok().data("items",a_good);
//    }


    /*
     * 增加的部分
     * */
    @PostMapping("/addGoods")
    public R addGoods(@RequestBody Goods goods){

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


