package com.seu.springboot.service;

import com.seu.springboot.entity.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 讲师 服务类
 * </p>
 *
 * @author MisterDong
 * @since 2022-08-17
 */
public interface ITeacherService extends IService<Teacher> {

    List<Teacher> findAll();
    //boolean addTeachers();

}
