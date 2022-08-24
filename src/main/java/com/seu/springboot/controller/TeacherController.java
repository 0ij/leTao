package com.seu.springboot.controller;


import com.seu.springboot.entity.Teacher;
import com.seu.springboot.service.ITeacherService;
import com.seu.springboot.utils.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author MisterDong
 * @since 2022-08-17
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Resource
    ITeacherService service;


    /**
     * 获取teacher表中所有数据
     * @return list集合
     */
    @GetMapping("/getTeachers")
    public R getTeachers(){

        //调用service层函数
        List<Teacher> list = service.findAll();
        //System.err.println("list--------->"+list);
        //return  list;
        return R.ok().data("teachers",service.findAll());
    }

    @PostMapping("/addTeacher")
    public R addTeacher(@RequestBody Teacher teacher){
        boolean mark=service.save(teacher);
        if(mark)
            return R.ok();
        return R.error();
    };


}
