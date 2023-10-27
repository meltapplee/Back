package com.example.poststudy.domain.user.service;

import com.example.poststudy.domain.user.domain.RefreshToken;
import com.example.poststudy.domain.user.domain.repository.RefreshTokenRepository;
import com.example.poststudy.domain.user.service.exception.UserNotFoundException;
import com.example.poststudy.domain.user.service.util.UserUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
@RequiredArgsConstructor
public class LogoutService {

    private final RefreshTokenRepository refreshTokenRepository;
    private final UserUtil userUtil;

    public void logout() {
        RefreshToken refreshToken = refreshTokenRepository.findById(userUtil.getUserId()) .orElseThrow(() -> UserNotFoundException.EXCEPTION);

        refreshTokenRepository.delete(refreshToken);
    }
}
