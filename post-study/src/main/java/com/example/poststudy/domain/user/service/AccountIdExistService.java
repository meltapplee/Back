package com.example.poststudy.domain.user.service;

import com.example.poststudy.domain.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
public class AccountIdExistService {
    private final UserRepository userRepository;

    public void exist(String accountId) {
        if (userRepository.existsByAccountId(accountId)) throw new UserAlreadyExistException.EXCEPTION();
    }
}