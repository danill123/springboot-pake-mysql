package com.spring.dude.controllers;

import com.spring.dude.models.Rooms;
import com.spring.dude.services.RoomServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {
    private final RoomServices roomservices;

    public RoomRestController(RoomServices roomservices) {
        this.roomservices = roomservices;
    }

    @GetMapping
    public List<Rooms> getAllRooms() {
        return roomservices.getAllRooms();
    }

    @PostMapping
    public ResponseEntity<List<Rooms>> AddRooms(@RequestBody Rooms room) {
        try {
            roomservices.saveData(room);
            return new ResponseEntity<>(null, HttpStatus.CREATED);
        } catch( Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping
    public ResponseEntity<Rooms> UpdateRooms(@RequestBody Rooms room) {
        try {
            if(room.getId().toString().isEmpty()) {
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            }
            roomservices.updateData(room);
            return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Rooms> DeleteData(@PathVariable("id") Integer id) {
        try {
            // set value by oop paradigm
            Rooms rom = new Rooms();
            rom.setId(id);

            roomservices.deleteData(rom);
            return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
