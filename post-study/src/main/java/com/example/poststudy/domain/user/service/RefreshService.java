package com.example.poststudy.domain.user.service;

import com.example.poststudy.domain.user.domain.RefreshToken;
import com.example.poststudy.domain.user.domain.repository.RefreshTokenRepository;
import com.example.poststudy.domain.user.presentation.dto.response.TokenResponse;
import com.example.poststudy.domain.user.exception.RefreshTokenNotFoundException;
import com.example.poststudy.global.security.exception.JwtInvalidException;
import com.example.poststudy.global.security.jwt.JwtProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
@RequiredArgsConstructor
public class RefreshService {
    private final JwtProvider jwtProvider;
    private final RefreshTokenRepository refreshTokenRepository;

    public TokenResponse refresh(String refreshToken) {
        if(!jwtProvider.validate(refreshToken)) throw JwtInvalidException.EXCEPTION;
        RefreshToken token = refreshTokenRepository.findByRefreshToken(refreshToken).orElseThrow(() -> RefreshTokenNotFoundException.EXCEPTION);

        String accountId = token.getAccountId();
        String nAccessToken = jwtProvider.generateToken(accountId);
        String nRefreshToken = jwtProvider.generateRefreshToken(accountId);

        return TokenResponse.builder()
                .accessToken(nAccessToken)
                .refreshToken(nRefreshToken)
                .build();

    }
}
