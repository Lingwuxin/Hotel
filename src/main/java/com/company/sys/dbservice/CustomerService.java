package com.company.sys.dbservice;

import com.company.sys.pojo.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> list();

    void save(Customer customer);

    Integer insert(Customer customer);



    void checkOutById(Integer customerId);
}
