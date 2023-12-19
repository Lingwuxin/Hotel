package com.company.sys.mapper;

import com.company.sys.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from User where username = #{username}")
    User findByUserName(String username);
}
