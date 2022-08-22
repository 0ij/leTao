package com.seu.springboot.controller;


import com.seu.springboot.entity.Shop;
import com.seu.springboot.entity.Storekeeper;
import com.seu.springboot.service.IStorekeeperService;
import com.seu.springboot.utils.R;
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
@RequestMapping("/storekeeper")
@CrossOrigin
public class StorekeeperController {

    @Autowired
    IStorekeeperService storekeeperService;

    @GetMapping("/getStorekeepers")
    public R getStorekeepers() {
        return R.ok().data("storekeepers", storekeeperService.findAll());
    }

    @GetMapping("/deleteStorekeeperById")
    public R deleteStorekeeperById(Integer kid) {
        boolean r = storekeeperService.removeById(kid);
        if (r) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @PostMapping("/addStorekeeper")
    public R addStorekeeper(@RequestBody Storekeeper storekeeper) {
        boolean result = storekeeperService.save(storekeeper);
        if (result) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @GetMapping("/getStorekeeperById/{kid}")
    public R getStorekeeperById(@PathVariable Integer kid) {
        Storekeeper storekeeper = storekeeperService.getById(kid);
        return R.ok().data("items", storekeeper);
    }

    @PostMapping("/updateStorekeeper")
    public R updateStorekeeper(@RequestBody Storekeeper storekeeper) {
        boolean result = storekeeperService.updateById(storekeeper);
        if (result) {
            return R.ok();
        } else {
            return R.error();
        }
    }
}
