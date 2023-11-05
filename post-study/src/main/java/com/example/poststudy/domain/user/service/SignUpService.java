package com.example.poststudy.domain.user.service;

import com.example.poststudy.domain.user.domain.RefreshToken;
import com.example.poststudy.domain.user.domain.User;
import com.example.poststudy.domain.user.domain.repository.RefreshTokenRepository;
import com.example.poststudy.domain.user.domain.repository.UserRepository;
import com.example.poststudy.domain.user.presentation.dto.request.SignupRequest;
import com.example.poststudy.domain.user.presentation.dto.response.TokenResponse;
import com.example.poststudy.global.security.jwt.JwtProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
@RequiredArgsConstructor
public class SignUpService {
    private final AccountIdExistService accountIdExistService;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final RefreshTokenRepository refreshTokenRepository;
    private final JwtProvider jwtProvider;

    public TokenResponse signUp(SignupRequest request) {
        accountIdExistService.exist(request.getAccountId());

        User user = userRepository.save(User.builder()
                .accountId(request.getAccountId())
                .nickname(request.getNickname())
                .password(passwordEncoder.encode(request.getPassword()))
                .build());

        return TokenResponse.builder()
                .refreshToken(refreshTokenRepository.save(RefreshToken.builder()
                        .accountId(user.getAccountId())
                        .refreshToken(jwtProvider.generateRefreshToken(user.getAccountId()))
                        .build()).getRefreshToken())
                .accessToken(jwtProvider.generateToken(user.getAccountId()))
                .build();
    }
}
