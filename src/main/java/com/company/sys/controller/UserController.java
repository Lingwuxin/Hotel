package com.company.sys.controller;

import com.company.sys.dbservice.UserService;
import com.company.sys.pojo.Result;
import com.company.sys.pojo.User;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }
    @PostMapping ("/login")
    public Result login(@Pattern(regexp = "^\\S{5,14}$")String username,@Pattern(regexp = "^\\S{5,14}$")String password) {
        User user= userService.findByUserName(username);
        if(user==null){
            return  Result.error("Username not found!");
        }
        else{
            return Result.success("Username found.");
        }
    }

    @GetMapping("/secure")
    public String secureEndpoint() {
        return "Secure API endpoint, authentication required";
    }
}
