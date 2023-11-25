package com.company.sys.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    private Integer roomId;
    private Integer roomNumber;
    private String roomType;
    private Float price;
    private String status;
}
