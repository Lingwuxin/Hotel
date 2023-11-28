package com.company.sys.dbservice;

import com.company.sys.pojo.Reservation;

public interface ReservationService {
    void save(Reservation reservation);

    void checkOutByCustomerId(Integer customerID);

    Integer selectRoomIdByCustomerId(Integer customerId);
}
