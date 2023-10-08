package com.example.poststudy.domain.user.service.exception;

import com.example.poststudy.global.error.CustomException;
import com.example.poststudy.global.error.ErrorCode;

public class JwtInvalidException extends CustomException {
    public static final CustomException EXCEPTION = new JwtInvalidException();

    public JwtInvalidException() {
        super(ErrorCode.JWT_INVALID);
    }
}
