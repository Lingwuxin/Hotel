package com.company.sys.mapper;

import com.company.sys.pojo.Customer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CustomerMapper {
    @Select("select * from Customer")
    List<Customer> list();
    @Insert("INSERT INTO Customer (firstName, lastName, email, phone, creditCardInfo) VALUES ( #{firstName}, #{lastName}, #{email}, #{phone}, #{creditCardInfo})")
    void save(Customer customer);
}
