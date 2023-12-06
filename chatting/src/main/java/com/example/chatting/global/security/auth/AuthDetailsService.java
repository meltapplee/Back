package com.example.chatting.global.security.auth;

import com.example.chatting.domain.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String accountId) {
        return userRepository.findByNickname(accountId)
                .map(AuthDetails::new)
                .orElseThrow(() -> new RuntimeException("USER_NOT_FOUND"));
    }
}
