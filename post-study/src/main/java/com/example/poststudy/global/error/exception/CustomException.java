package com.example.poststudy.global.error.exception;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException{
    private final ErrorCode errorCode;

    public CustomException(ErrorCode errorCode) {
        super();
        this.errorCode = errorCode;
    }
}
