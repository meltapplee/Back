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

    private final UserRepository userRepository;
    private final RefreshTokenRepository refreshTokenRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtProvider jwtProvider;
    private final AccountIdExistService accountIdExistService;

    public TokenResponse signUp(SignupRequest request) {
        accountIdExistService.exist(request.getAccountId());

        System.out.println(request.getAccountId());

        User user = userRepository.save(User.builder()
                .nickname(request.getNickname())
                    .accountId(request.getAccountId())
                    .password(passwordEncoder.encode(request.getPassword()))
                .build());

        return TokenResponse.builder()
                .accessToken(jwtProvider.generateToken(user.getAccountId()))
                .refreshToken(refreshTokenRepository.save(RefreshToken.builder()
                    .accountId(user.getAccountId())
                    .refreshToken(jwtProvider.generateRefreshToken(user.getAccountId()))
                    .build()).getRefreshToken())
                .build();
    }
}
