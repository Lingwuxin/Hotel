package com.company.sys.mapper;

import com.company.sys.pojo.Room;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 房间管理
 */
@Mapper
public interface RoomMapper {
    /**
     * 查询全部房间数据
     *
     * @return 包含全部房间数据的列表
     */
    @Select("select * from Room")
    List<Room> list();

    @Update("UPDATE Room SET Status = 'Occupied' WHERE RoomNumber = #{num}")
    @Options(useGeneratedKeys = true, keyProperty = "roomId", keyColumn = "RoomID")
    Integer updateRoomStatusByRoomNum(@Param("num") Integer num);
    @Update("UPDATE Room SET Status = '0' WHERE RoomID = #{roomid}")
    void checkOutByRoomId(Integer roomid);
}
