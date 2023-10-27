package com.example.poststudy.domain.user.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User {

    @Id
    @Column(nullable = false, length = 12)
    private String accountId;

    @Column(nullable = false, length = 12)
    private String nickname;

    @Column(nullable = false, length = 60)
    private String password;

    @Builder
    public User(String accountId, String nickname, String password) {
        this.accountId = accountId;
        this.nickname = nickname;
        this.password = password;
    }
}
