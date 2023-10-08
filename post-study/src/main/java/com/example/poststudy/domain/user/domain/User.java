package com.example.poststudy.domain.user.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String accountId;

    @Column(nullable = false)
    private String nickName;

    @Column(nullable = false)
    private String password;

    @Builder
    public User(String accountId, String nickName, String password) {
        this.accountId = accountId;
        this.nickName = nickName;
        this.password = password;
    }

    public void userUpdate(String accountId) {
        this.nickName = nickName;
    }
}
