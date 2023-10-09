package com.example.poststudy.domain.user.presentation;

import com.example.poststudy.domain.user.presentation.dto.request.UserRequest;
import com.example.poststudy.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;
    private final UserRequest userRequest;

    @PostMapping
    public Long signUp() {

    }
}
