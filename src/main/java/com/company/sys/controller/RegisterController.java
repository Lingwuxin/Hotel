package com.company.sys.controller;

import com.company.sys.dbservice.RegisterService;
import com.company.sys.pojo.Register;
import com.company.sys.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class RegisterController {
    private final RegisterService registerService;
    @Autowired
    public RegisterController(RegisterService registerService){
        this.registerService=registerService;
    }
    @PostMapping("/register")
    public Result registers(@RequestBody Register register){
        log.info("等级住客信息");
        registerService.save(register);
        return Result.success("住客信息登记成功");
    }
}
