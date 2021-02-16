package com.spring.dude.repository;

import com.spring.dude.models.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Rooms, Long> {
}
