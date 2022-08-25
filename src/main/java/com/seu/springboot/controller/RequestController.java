package com.seu.springboot.controller;

import com.seu.springboot.entity.Evaluation;
import com.seu.springboot.entity.Request;
import com.seu.springboot.service.IRequestService;
import com.seu.springboot.utils.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/request")
@CrossOrigin
public class RequestController {

    @Resource
    IRequestService service;

    /*
     * 查询的部分
     * */
    @GetMapping("/getRequests")
    public R getRequests(){

        //调用service层函数
       // List<Request> list = service.findAll();
        //System.err.println("list--------->"+list);
        //return  list;
        return R.ok().data("Request",service.findAllRequests());
    };

    @PostMapping("/getRequestByID")
    public R getRequestByID(int rid){
        Request temp=service.getById(rid);
        List<Request> list=new ArrayList<>();
        list.add(temp);
        return R.ok().data("items",list);
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
