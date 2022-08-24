package com.gk.springboot.controller;

import com.gk.springboot.entity.Goods;
import com.gk.springboot.entity.Request;
import com.gk.springboot.entity.ShopSales;
import com.gk.springboot.service.IRequestService;
import com.gk.springboot.service.IShopSalesService;
import com.gk.springboot.utils.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ShopSales")
public class RequestController {

    @Resource
    IRequestService service;

    /*
     * 查询的部分
     * */
    @GetMapping("/getRequest")
    public R getShopSales(){

        //调用service层函数
        List<Request> list = service.findAll();
        //System.err.println("list--------->"+list);
        //return  list;
        return R.ok().data("Request",service.findAll());
    };

    @GetMapping("/getRequestByID")
    public R getRequestByID( Integer id){
        Request temp=service.getById(id);
        return R.ok().data("items",temp);
    };

    /*
     * 增加的部分
     * */
    @PostMapping("/addRequest")
    public R addRequest(@RequestBody Request request){
        boolean mark=service.save(request);
        if(mark)
            return R.ok();
        return R.error();
    };

    /*
     * 删除的部分
     * */
    @GetMapping("/delRequestByID")
    public R delRequestByID(Integer id){
        boolean wre=service.removeById(id);
        if(wre)
            return R.ok();
        return R.error();

    };

    /*
     * 修改的部分
     * */
    @PostMapping("/updateRequest")
    public R updateRequest(@RequestBody Request request){
        boolean mark=service.updateById(request);
        if(mark)
            return R.ok();
        return R.error();
    }


}
