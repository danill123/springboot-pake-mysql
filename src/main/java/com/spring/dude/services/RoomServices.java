package com.spring.dude.services;

import com.spring.dude.models.Rooms;
import com.spring.dude.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServices {
    private final RoomRepository roomRepository;

    public RoomServices(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    /* for hardcode insert data
    private static final List<Rooms> rooms = new ArrayList();

    static {
        for (int i = 0; i < 8; i++) {
            rooms.add(new Rooms(UUID.randomUUID().toString(), " Rooms " + i, " R " + i, " Q "));
        }
    }
    */

    public List<Rooms> getAllRooms() {
        return roomRepository.findAll();
    }

    public void saveData(Rooms room) {
        roomRepository.save(room);
    }

    public void updateData(Rooms room) {
        roomRepository.save(room);
    }

    public void deleteData(Rooms room) {
        roomRepository.delete(room);
    };
}
