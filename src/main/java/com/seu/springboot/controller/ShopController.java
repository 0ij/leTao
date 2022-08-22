package com.seu.springboot.controller;


import com.seu.springboot.entity.Shop;
import com.seu.springboot.service.IShopService;
import com.seu.springboot.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author MisterDong
 * @since 2022-08-17
 */
@RestController
@RequestMapping("/shop")
@CrossOrigin
public class ShopController {
    @Autowired
    IShopService shopService;

    @GetMapping("/getShops")
    public R getShops() {
        return R.ok().data("shops", shopService.findAll());
    }

    @GetMapping("/deleteShopById")
    public R deleteShopById(Integer sid) {
        boolean r = shopService.removeById(sid);
        if (r) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @PostMapping("/addShop")
    public R addShop(@RequestBody Shop shop) {
        boolean result = shopService.save(shop);
        if (result) {
            return R.ok();
        } else {
            return R.error();
        }
    }

    @GetMapping("/getShopById/{sid}")
    public R getShopById(@PathVariable Integer sid) {
        Shop shop = shopService.getById(sid);
        return R.ok().data("items", shop);
    }

    @PostMapping("/updateShop")
    public R updateShop(@RequestBody Shop shop) {
        boolean result = shopService.updateById(shop);
        if (result) {
            return R.ok();
        } else {
            return R.error();
        }
    }
}
