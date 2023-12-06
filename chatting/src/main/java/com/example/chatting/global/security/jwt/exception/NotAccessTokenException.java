package com.example.chatting.global.security.jwt.exception;


import com.example.chatting.global.error.exception.BaseException;
import com.example.chatting.global.error.exception.ErrorCode;

public class NotAccessTokenException extends BaseException {
    public static final BaseException EXCEPTION = new NotAccessTokenException();

    public NotAccessTokenException() {
        super(ErrorCode.NOT_ACCESS_TOKEN);
    }
}
