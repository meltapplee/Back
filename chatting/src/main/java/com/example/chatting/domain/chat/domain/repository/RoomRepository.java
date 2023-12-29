package com.example.chatting.domain.chat.domain.repository;

import com.example.chatting.domain.chat.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Integer> {
}
