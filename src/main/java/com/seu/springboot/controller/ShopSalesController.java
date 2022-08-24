package com.seu.springboot.controller;


import com.seu.springboot.entity.ShopSales;
import com.seu.springboot.service.IShopSalesService;
import com.seu.springboot.utils.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/ShopSales")
public class ShopSalesController {

    @Resource
    IShopSalesService service;
    /*
    * 查询的部分
    * */
    @GetMapping("/getShopSales")
    public R getShopSales(){

        //调用service层函数
        List<ShopSales> list = service.findAll();
        //System.err.println("list--------->"+list);
        //return  list;
        return R.ok().data("teachers",service.findAll());
    };
    @GetMapping("/getShopSalesByID")
    public R getShopSalesByID( Integer id){
        ShopSales temp=service.getById(id);
        return R.ok().data("items",temp);
    };
    /*
     * 增加的部分
     * */
    @PostMapping("/addShopSales")
    public R addShopSales(@RequestBody ShopSales shopsales){
        boolean mark=service.save(shopsales);
        if(mark)
            return R.ok();
        return R.error();
    }

    /*
     * 删除的部分
     * */
    @GetMapping("/delShopSalesByID")
    public R delShopSalesByID(Integer id){
        boolean wre=service.removeById(id);
        if(wre)
            return R.ok();
        return R.error();

    }

    /*
     * 修改的部分
     * */
    @PostMapping("/updateShopSales")
    public R updateShopSales(@RequestBody ShopSales shopsales){
        boolean mark=service.updateById(shopsales);
        if(mark)
            return R.ok();
        return R.error();
    }
}
