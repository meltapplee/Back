package com.example.poststudy.domain.user.service;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;


public class UserService {

    @Getter
    public static class SignUp{
        @NotBlank
        @Size(min = 5, max = 12)
        private String accountId;

        @NotBlank
        @Size(min = 3, max = 10)
        private String nickName;

        @NotBlank
        @Size(min = 6, max = 20)
        private String password;
    }
}
