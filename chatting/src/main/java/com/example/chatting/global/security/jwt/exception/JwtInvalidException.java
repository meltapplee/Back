package com.example.chatting.global.security.jwt.exception;

import com.example.chatting.global.error.exception.BaseException;
import com.example.chatting.global.error.exception.ErrorCode;

public class JwtInvalidException extends BaseException {
    public static final BaseException EXCEPTION = new JwtInvalidException();

    public JwtInvalidException() {
        super(ErrorCode.JWT_INVALID);
    }
}
