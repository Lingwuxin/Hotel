package com.company.sys.mapper;

import com.company.sys.pojo.Customer;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CustomerMapper {
    @Select("select * from Customer")
    List<Customer> list();
    @Insert("INSERT INTO Customer (firstName, lastName, email, phone, creditCardInfo) VALUES ( #{firstName}, #{lastName}, #{email}, #{phone}, #{creditCardInfo})")
    void save(Customer customer);
    @Insert("INSERT INTO Customer (FirstName, LastName, Email, Phone, CreditCardInfo) " +
            "VALUES (#{firstName}, #{lastName}, #{email}, #{phone}, #{creditCardInfo})")
    @Options(useGeneratedKeys = true, keyProperty = "customerID", keyColumn = "CustomerID")
    void insert(Customer customer);

    @Update("UPDATE Customer SET status = 'checkout' WHERE CustomerID = #{customerId}")
    void checkOutById(@Param("customerId") Integer customerId);
}
