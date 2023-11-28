package com.company.sys.dbservice;

import com.company.sys.pojo.Room;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RoomService {
    /**
     * 查询全部房间信息
     * @return 包含全部房间数据的列表
     */
    List<Room> list();

    Integer updateRoomStatusByRoomNum(Integer roomNumber);



    void checkOutByRoomId(Integer roomid);
}
