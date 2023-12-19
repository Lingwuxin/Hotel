package com.company.sys.dbservice.impl;

import com.company.sys.dbservice.UserService;
import com.company.sys.mapper.UserMapper;
import com.company.sys.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
    @Autowired
    public UserServiceImpl(UserMapper userMapper){
        this.userMapper=userMapper;
    }

    @Override
    public User findByUserName(String username) {
        return userMapper.findByUserName(username);
    }
}
