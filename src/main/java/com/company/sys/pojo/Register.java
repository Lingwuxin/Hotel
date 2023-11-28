package com.company.sys.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用于记录整个登记过程的全部信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Register {
    private Integer customerID;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String creditCardInfo;
    private Integer roomNumber;
    private Date checkInDate;
    private Date checkOutDate;
    private String status;
}
