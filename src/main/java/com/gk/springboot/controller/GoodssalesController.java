package com.gk.springboot.controller;


import com.gk.springboot.entity.Goodssales;
import com.gk.springboot.entity.Shop;
import com.gk.springboot.service.IGoodssalesService;
import com.gk.springboot.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author MisterDong
 * @since 2022-08-17
 */
@RestController
@RequestMapping("/goodssales")
@CrossOrigin
public class GoodssalesController {

    @Autowired
    IGoodssalesService service;

    @GetMapping("/getGoodssales")
    public R getGoodssales() {
        return R.ok().data("goodssales", service.findAll());
    }

    @GetMapping("/deleteGoodssalesById")
    public R deleteGoodssalesById(Integer gid) {
        boolean r = service.removeById(gid);
        if (r) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @PostMapping("/addGoodssales")
    public R addGoodssales(@RequestBody Goodssales goodssales) {
        boolean result = service.save(goodssales);
        if (result) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @GetMapping("/getGoodssalesById/{gid}")
    public R getGoodssalesById(@PathVariable Integer gid) {
        Goodssales goodssales = service.getById(gid);
        return R.ok().data("items", goodssales);
    }

    @PostMapping("/updateGoodssales")
    public R updateGoodssales(@RequestBody Goodssales goodssales) {
        boolean result = service.updateById(goodssales);
        if (result) {
            return R.ok();
        } else {
            return R.error();
        }
    }
}
