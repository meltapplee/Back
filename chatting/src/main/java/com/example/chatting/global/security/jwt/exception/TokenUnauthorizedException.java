package com.example.chatting.global.security.jwt.exception;


import com.example.chatting.global.error.exception.BaseException;
import com.example.chatting.global.error.exception.ErrorCode;

public class TokenUnauthorizedException extends BaseException {
    public static final BaseException EXCEPTION = new TokenUnauthorizedException();

    public TokenUnauthorizedException() {
        super(ErrorCode.TOKEN_UNAUTHORIZED);
    }
}
