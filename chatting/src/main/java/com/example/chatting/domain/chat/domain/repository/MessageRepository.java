package com.example.chatting.domain.chat.domain.repository;

import com.example.chatting.domain.chat.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
