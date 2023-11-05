package com.example.poststudy.global.security.exception;


import com.example.poststudy.global.error.exception.CustomException;
import com.example.poststudy.global.error.exception.ErrorCode;

public class TokenUnauthorizedException extends CustomException {
    public static final CustomException EXCEPTION = new TokenUnauthorizedException();

    public TokenUnauthorizedException() {
        super(ErrorCode.TOKEN_UNAUTHORIZED);
    }
}
