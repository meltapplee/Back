package com.example.poststudy.domain.user.presentation.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class TokenResponse {

    private final String refreshToken;
    private final String accessToken;

    @Builder
    public TokenResponse (String refreshToken, String accessToken){
        this.refreshToken = refreshToken;
        this.accessToken = accessToken;
    }
}
