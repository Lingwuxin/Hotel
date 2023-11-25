package com.company.sys.controller;
import com.company.sys.dbservice.RoomService;
import com.company.sys.pojo.Result;
import com.company.sys.pojo.Room;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class RoomController {
    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }
    @GetMapping("/room")
    public Result list(){
        log.info("查询全部房间信息");
        List<Room> roomList=roomService.list();
        return Result.success(roomList);
    }
}
