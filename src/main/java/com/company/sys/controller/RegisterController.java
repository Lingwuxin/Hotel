package com.company.sys.controller;

import com.company.sys.dbservice.CustomerService;
import com.company.sys.dbservice.ReservationService;
import com.company.sys.dbservice.RoomService;
import com.company.sys.pojo.Customer;
import com.company.sys.pojo.Register;
import com.company.sys.pojo.Reservation;
import com.company.sys.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Slf4j
@RestController
public class RegisterController {
    private final CustomerService customerService;
    private final RoomService roomService;
    private final ReservationService reservationService;
    @Autowired
    public RegisterController(CustomerService customerService,RoomService roomService,ReservationService reservationService){
        this.customerService=customerService;
        this.roomService=roomService;
        this.reservationService=reservationService;
    }
    @PostMapping("/checkin")
    public Result checkin(@RequestBody Register register){
        System.out.println("开始登记住客信息");
        System.out.println(register);
        // 创建新的 Reservation 对象并设置属性
        Reservation reservation = new Reservation();

        Customer customer=new Customer();
        customer.setEmail(register.getEmail());
        customer.setPhone(register.getPhone());
        customer.setLastName(register.getLastName());
        customer.setFirstName(register.getFirstName());
        customer.setCreditCardInfo(register.getCreditCardInfo());
        register.setCustomerID(customerService.insert(customer));

        Integer roomId = roomService.updateRoomStatusByRoomNum(register.getRoomNumber());//同时返回roomid

        reservation.setCustomerId(register.getCustomerID());
        reservation.setCheckInDate(new Date());
        reservation.setRoomId(roomId);
        reservation.setStatus(register.getStatus());
        System.out.println(reservation);

        reservationService.save(reservation);
        return Result.success("住客信息登记成功");
    }
    @PostMapping("/checkout/{customerId}")
    public Result checkout(@PathVariable("customerId") Integer customerId){
        customerService.checkOutById(customerId);
        reservationService.checkOutByCustomerId(customerId);
        Integer roomid=reservationService.selectRoomIdByCustomerId(customerId);
        roomService.checkOutByRoomId(roomid);

        return Result.success("退房成功");
    }
}
