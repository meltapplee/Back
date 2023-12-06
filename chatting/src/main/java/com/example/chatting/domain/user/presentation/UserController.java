package com.example.chatting.domain.user.presentation;

import com.example.chatting.domain.user.presentation.request.SignRequest;
import com.example.chatting.domain.user.presentation.response.TokenResponse;
import com.example.chatting.domain.user.service.SignInService;
import com.example.chatting.domain.user.service.SignUpService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
public class UserController {
    private final SignUpService signUpService;
    private final SignInService signInService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/signup")
    public TokenResponse signup(@RequestBody @Valid SignRequest request) {
        return signUpService.signup(request);
    }

    @PostMapping("/login")
    public TokenResponse login(@RequestBody @Valid SignRequest request) {
        return signInService.signIn(request);
    }
}
