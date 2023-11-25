package com.company.sys.mapper;

import com.company.sys.pojo.Register;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegisterMapper {


    void save(Register register);
}
