package com.example.chatting.domain.chat.domain.repository;


import com.example.chatting.domain.chat.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
}
