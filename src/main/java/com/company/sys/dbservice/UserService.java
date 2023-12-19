package com.company.sys.dbservice;

import com.company.sys.pojo.User;

public interface UserService {
    User findByUserName(String username);
}
