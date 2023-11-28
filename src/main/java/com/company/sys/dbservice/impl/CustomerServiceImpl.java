package com.company.sys.dbservice.impl;

import com.company.sys.dbservice.CustomerService;
import com.company.sys.mapper.CustomerMapper;
import com.company.sys.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerMapper customerMapper;
    @Autowired
    public CustomerServiceImpl(CustomerMapper customerMapper){
        this.customerMapper=customerMapper;
    }
    @Override
    public List<Customer> list(){
        return customerMapper.list();
    }

    @Override
    public void save(Customer customer) {
        customerMapper.save(customer);
    }

    @Override
    public Integer insert(Customer customer) {
        customerMapper.insert(customer);
        return customer.getCustomerID();
    }

    @Override
    public void checkOutById(Integer customerId) {
        customerMapper.checkOutById(customerId);
    }

}
