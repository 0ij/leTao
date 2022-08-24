package com.gk.springboot.controller;

import org.springframework.web.bind.annotation.*;
import com.gk.springboot.utils.R;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    //login
    @PostMapping("/login")
    public R login(String username,String password){
        System.err.println("登录" );

        return R.ok().data("token","admin");
    }
    @GetMapping("/info")
    public R info(String info){
        System.err.println("接口" );
        return R.ok().data("roles","[admin]");
    }
}
