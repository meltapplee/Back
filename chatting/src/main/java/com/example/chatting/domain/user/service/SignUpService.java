package com.example.chatting.domain.user.service;

import com.example.chatting.domain.user.domain.User;
import com.example.chatting.domain.user.domain.repository.UserRepository;
import com.example.chatting.domain.user.exception.UserAlreadyExistException;
import com.example.chatting.domain.user.exception.UserNotFoundException;
import com.example.chatting.domain.user.presentation.request.SignRequest;
import com.example.chatting.domain.user.presentation.response.TokenResponse;
import com.example.chatting.global.security.jwt.JwtProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SignUpService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtProvider jwtProvider;

    public TokenResponse signup(SignRequest request) {
        System.out.println(request.getNickname());
        System.out.println(request.getPassword());

        if(userRepository.findByNickname(request.getNickname()).isPresent()) {
            throw UserAlreadyExistException.EXCEPTION;
        }

        userRepository.save(User.builder()
                .nickname(request.getNickname())
                .password(passwordEncoder.encode(request.getPassword()))
                .build());

        String accessToken = jwtProvider.generateToken(request.getNickname());
        String refreshToken = jwtProvider.generateRefreshToken(request.getNickname());

        return TokenResponse.builder()
                .accessToken(accessToken)
                .refreshToken(refreshToken)
                .build();
    }
}
