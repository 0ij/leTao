package com.seu.springboot.controller;

import com.seu.springboot.utils.R;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @PostMapping("/login")
    public R login(String username, String password) {
        return R.ok().data("token", "admin");
    }

    @GetMapping("/info")
    public R info(String token) {
        return R.ok().data("roles", "[admin]").data("name", "admin");
    }
}
