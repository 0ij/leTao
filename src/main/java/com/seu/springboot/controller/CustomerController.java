package com.seu.springboot.controller;

import com.seu.springboot.entity.Customer;
import com.seu.springboot.entity.Goods;
import com.seu.springboot.service.ICustomerService;
import com.seu.springboot.utils.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {
    @Resource
    ICustomerService customerService;


    @GetMapping("/getCustomers")
    public R getCustomers(){
        return R.ok().data("customers",customerService.findAllCustomers());
    }

    @PostMapping("/addCustomer")
    public R addCustomer(@RequestBody Customer customer){

        boolean mark=customerService.save(customer);
        if(mark)
            return R.ok();
        return R.error();
    }

//    @PostMapping("/updateCustomerName")
//    public Customer updateCustomerNameById(Integer cid,String cname){
//        System.err.print("函数调用");
//        System.err.print("cid:"+cid+"-----");
//        System.err.print("cname:"+cname);
//        Customer customer = customerService.updateCustomerNameById(cid,cname);
//        return customer;
//    }

    @PostMapping("/updateCustomerName")
    public R updateCustomerNameById(Integer cid,String cname){
        System.err.print("函数调用");
//        System.err.print("cid:"+cid+"-----");
//        System.err.print("cname:"+cname);
        Customer customer =new Customer();
        customer.setCname(cname);
        customer.setCid(cid);
        boolean mark=customerService.updateById(customer);
        if(mark)
            return R.ok().data("cid",cid).data("cname",cname);
        return R.error();
    };

//    @GetMapping("/deleteCustomer")
//    public int deleteCustomerById(Integer id){
//        Integer res = customerService.deleteCustomerById(id);
//        return res;
//    }

    @GetMapping("/deleteCustomer")
    public R deleteCustomerById(Integer id){
        boolean wre=customerService.removeById(id);
        if(wre) {
            return R.ok();
        }
        return R.error();

    }
}
