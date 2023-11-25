package com.company.sys.dbservice.impl;

import com.company.sys.dbservice.RoomService;
import com.company.sys.mapper.RoomMapper;
import com.company.sys.pojo.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    private final RoomMapper roomMapper;
    @Autowired
    public RoomServiceImpl(RoomMapper roomMapper){
        this.roomMapper=roomMapper;
    }
    @Override
    public List<Room> list() {
        return roomMapper.list();
    }
}