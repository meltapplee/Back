package com.example.poststudy.domain.user.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class RefreshToken {

    @Id
    private String accountId;

    @Column(nullable = false)
    private String refreshToken;

    @Builder
    public RefreshToken (String accountId, String refreshToken) {
        this.accountId = accountId;
        this.refreshToken = refreshToken;
    }
}
