package com.example.poststudy.global.security.exception;


import com.example.poststudy.global.error.CustomException;
import com.example.poststudy.global.error.ErrorCode;

public class TokenUnauthorizedException extends CustomException {
    public static final CustomException EXCEPTION = new TokenUnauthorizedException();

    public TokenUnauthorizedException() {
        super(ErrorCode.TOKEN_UNAUTHORIZED);
    }
}
