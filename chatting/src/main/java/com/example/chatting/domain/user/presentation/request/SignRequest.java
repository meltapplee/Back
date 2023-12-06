package com.example.chatting.domain.user.presentation.request;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
public class SignRequest {
    @NotBlank
    @Size(min = 2, max = 12)
    private String nickname;

    @NotNull
    @Size(min = 6, max = 20)
    private String password;
}
