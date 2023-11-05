package com.example.poststudy.global.security.exception;

import com.example.poststudy.global.error.exception.CustomException;
import com.example.poststudy.global.error.exception.ErrorCode;

public class JwtInvalidException extends CustomException {
    public static final CustomException EXCEPTION = new JwtInvalidException();

    public JwtInvalidException() {
        super(ErrorCode.JWT_INVALID);
    }
}
