package com.seu.springboot.controller;

import com.seu.springboot.entity.Administrator;
import com.seu.springboot.service.IAdministratorService;
import com.seu.springboot.utils.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/Administrator")
@CrossOrigin
public class AdministratorController {
    @Resource
    IAdministratorService service;
    /*
     * 查询的部分
     * */
    @GetMapping("/getAdministrator")
    public R getAdministrator(){

        //调用service层函数
        List<Administrator> list = service.findAll();

        //System.err.println("list--------->"+list);
        //return  list;
        return R.ok().data("Administrator",service.findAll());
    }

    @GetMapping("/getAdministratorByID")
    public R getAdministratorByID( Integer id){
        Administrator administrator=service.getById(id);


        return R.ok().data("items",administrator);
    }
    /*
     * 增加的部分
     * */
    @PostMapping("/addAdministrator")
    public R addAdministrator(@RequestBody Administrator administrator){

        boolean mark=service.save(administrator);
        if(mark)
            return R.ok();
        return R.error();
    }
    /*
     *  删除的部分
     * */
    @GetMapping("/delAdministratorByID")
    public R delAdministratorByID(Integer id){
        boolean wre=service.removeById(id);
        if(wre) {
            return R.ok();
        }
        return R.error();

    }
    /*
     * 修改的部分
     * */
    @PostMapping("/updateAdministrator")
    public R updateAdministrator(@RequestBody Administrator administrator){
        boolean mark=service.updateById(administrator);
        if(mark)
            return R.ok();
        return R.error();
    };


}
