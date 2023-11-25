package com.company.sys.dbservice.impl;

import com.company.sys.dbservice.RegisterService;
import com.company.sys.mapper.RegisterMapper;
import com.company.sys.pojo.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {

    private final RegisterMapper registerMapper;

    @Autowired
    public RegisterServiceImpl(RegisterMapper registerMapper){
        this.registerMapper=registerMapper;
    }
    @Override
    public void save(Register register) {
        registerMapper.save(register);
    }
}
