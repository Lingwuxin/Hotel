package com.company.sys.dbservice.impl;

import com.company.sys.dbservice.ReservationService;
import com.company.sys.mapper.ReservationMapper;
import com.company.sys.pojo.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {
    private final ReservationMapper reservationMapper;
    @Autowired
    public ReservationServiceImpl(ReservationMapper reservationMapper){
        this.reservationMapper=reservationMapper;
    }

    @Override
    public void save(Reservation reservation) {
        reservationMapper.save(reservation);
    }

    @Override
    public void checkOutByCustomerId(Integer customerID) {
        reservationMapper.checkOutByCustomerId(customerID);
    }

    @Override
    public Integer selectRoomIdByCustomerId(Integer customerId) {
        return reservationMapper.selectRoomIdByCustomerId(customerId);
    }
}
