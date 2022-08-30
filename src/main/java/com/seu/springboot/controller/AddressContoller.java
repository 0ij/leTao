package com.seu.springboot.controller;

import com.seu.springboot.entity.Address;
import com.seu.springboot.entity.Administrator;
import com.seu.springboot.service.IAddressService;
import com.seu.springboot.utils.R;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/Address")
@CrossOrigin
public class AddressContoller {
    @Resource
    IAddressService service;

    @GetMapping("/getAddressByCid")
    public R getAdministrator(Integer cid){
        //调用service层函数
        List<Address> list = service.findAddress(cid);

        return R.ok().data("Address",service.findAddress(cid));
    }
}
