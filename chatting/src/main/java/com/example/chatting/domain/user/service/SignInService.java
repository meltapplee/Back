package com.example.chatting.domain.user.service;

import com.example.chatting.domain.user.domain.User;
import com.example.chatting.domain.user.domain.repository.UserRepository;
import com.example.chatting.domain.user.exception.PasswordNotMatchException;
import com.example.chatting.domain.user.exception.UserNotFoundException;
import com.example.chatting.domain.user.presentation.request.SignRequest;
import com.example.chatting.domain.user.presentation.response.TokenResponse;
import com.example.chatting.global.security.jwt.JwtProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SignInService {
    private final UserRepository userRepository;
    private final JwtProvider jwtProvider;
    private final PasswordEncoder passwordEncoder;

    public TokenResponse signIn(SignRequest request) {
        User user = userRepository.findByNickname(request.getNickname())
                .orElseThrow(()-> UserNotFoundException.EXCEPTION);

        if(!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw PasswordNotMatchException.EXCEPTION;
        }

        String accessToken = jwtProvider.generateToken(user.getNickname());
        String refreshToken = jwtProvider.generateRefreshToken(user.getNickname());

        return TokenResponse.builder()
                .accessToken(accessToken)
                .refreshToken(refreshToken)
                .build();
    }
}
