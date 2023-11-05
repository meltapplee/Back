package com.example.poststudy.global.error;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ErrorResponse {
    private final Integer status;
    private final String message;
}
