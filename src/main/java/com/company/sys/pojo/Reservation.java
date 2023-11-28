package com.company.sys.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    private Integer reservationId;
    private Integer customerId;
    private Integer roomId;
    private Date checkInDate;
    private Date checkOutDate;
    private String status;
}
