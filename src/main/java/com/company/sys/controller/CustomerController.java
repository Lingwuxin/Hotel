package com.company.sys.controller;

import com.company.sys.dbservice.CustomerService;
import com.company.sys.pojo.Customer;
import com.company.sys.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class CustomerController {
    private final CustomerService customerService;
    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService=customerService;
    }
    @GetMapping("/customer")
    public Result list(){
        log.info("查询所有住客信息");
        List<Customer> customers=customerService.list();
        return Result.success(customers);
    }
    @PostMapping("customer/register")
    public Result register(@RequestBody Customer customer) {
        log.info("登记住客信息: {}", customer);

        // 在将数据保存到数据库之前，执行任何验证或业务逻辑

        // 将住客信息保存到数据库
        customerService.save(customer);

        return Result.success("住客信息登记成功");
    }
}
