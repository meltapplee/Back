package com.example.poststudy.domain.user.presentation.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
@Getter
public class SignupRequest {

    @NotBlank
    @Size(min = 2, max = 12)
    private String accountId;

    @NotBlank
    @Size(min = 6, max = 20)
    private String password;

    @NotBlank
    @Size(min = 2, max = 12)
    private String nickname;
}
