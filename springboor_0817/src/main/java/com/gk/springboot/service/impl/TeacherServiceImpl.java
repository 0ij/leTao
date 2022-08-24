package com.gk.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gk.springboot.entity.Teacher;
import com.gk.springboot.mapper.TeacherMapper;
import com.gk.springboot.service.ITeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 讲师 服务实现类
 * </p>
 *
 * @author MisterDong
 * @since 2022-08-17
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {

    @Resource
    TeacherMapper mapper;

    @Override
    public List<Teacher> findAll() {

        //调用dao层函数

        QueryWrapper wrapper = new QueryWrapper();

        List<Teacher> list = this.baseMapper.selectList(wrapper); // mybatisplus 封装好的函数  获取所有




        return list;
    }

//    public boolean addTeachers(){
//
//        Teacher teacher = new Teacher();
//        teacher.setId(10011);
//
//
//        int res = mapper.insert(teacher);
//
//        return  false;
//    }

}
