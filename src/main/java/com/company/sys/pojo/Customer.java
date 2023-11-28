package com.company.sys.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private Integer customerID;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String creditCardInfo;
    private String status;
}
