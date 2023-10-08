package com.example.poststudy.domain.user.service.util;

import com.example.poststudy.domain.user.domain.User;
import com.example.poststudy.domain.user.domain.repository.UserRepository;
import com.example.poststudy.domain.user.service.exception.UserNotFoundException;
import com.example.poststudy.global.security.exception.JwtInvalidException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserUtil {
    private final UserRepository userRepository;

    public String getUserId() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null) throw JwtInvalidException.EXCEPTION;

        return authentication.getName();
    }

    public User findUser() {
        return userRepository.findById(getUserId()).orElseThrow(() -> UserNotFoundException.EXCEPTION);
    }
}
