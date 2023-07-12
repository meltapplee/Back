package com.example.poststudy.domain.controller;

import com.example.poststudy.domain.dto.request.PostRequest;
import com.example.poststudy.domain.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/post")
@RequiredArgsConstructor
@RestController
public class PostController {
    private final PostService postService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Long create(@RequestBody @Valid PostRequest request) {
        return postService.create(request);
    }
}
