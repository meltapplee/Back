package com.example.poststudy.domain.post.presentation.dto.response;

import lombok.Getter;

@Getter
public class ReturnIdResponse {
    private Long id;

    public ReturnIdResponse(Long id) {
        this.id = id;
    }
}
