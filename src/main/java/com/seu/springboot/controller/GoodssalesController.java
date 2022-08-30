package com.seu.springboot.controller;


import com.seu.springboot.entity.Evaluation;
import com.seu.springboot.entity.Goodssales;
import com.seu.springboot.service.IGoodssalesService;
import com.seu.springboot.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @GetMapping("/getGoodssalesByGid")
    public R getGoodssalesByGid(Integer gid) {
        List<Goodssales> list=new ArrayList<>();
        list = service.getGoodsSalesByG(gid);

        return R.ok().data("goodssales", list);
    }

    @GetMapping("/getGoodssalesBySid")
    public R getGoodssalesBySid(Integer sid) {
        List<Goodssales> list=new ArrayList<>();
        list = service.getGoodsSalesByS(sid);

        return R.ok().data("goodssales", list);
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
