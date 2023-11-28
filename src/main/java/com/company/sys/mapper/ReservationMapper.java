package com.company.sys.mapper;

import com.company.sys.pojo.Reservation;
import org.apache.ibatis.annotations.*;

@Mapper
public interface ReservationMapper {

    @Insert("INSERT INTO Reservation (CustomerId, RoomId, CheckInDate, CheckOutDate, Status) " +
            "VALUES (#{customerId}, #{roomId}, #{checkInDate}, #{checkOutDate}, #{status})")
    void save(Reservation reservation);

    @Update("UPDATE Reservation SET CheckOutDate = CURRENT_TIMESTAMP, Status = 'CheckOut' WHERE CustomerID = #{customerID}")
    void checkOutByCustomerId(Integer customerID);

    @Select("SELECT RoomID FROM Reservation WHERE CustomerID = #{customerId}")
    Integer selectRoomIdByCustomerId(@Param("customerId") Integer customerId);
}
