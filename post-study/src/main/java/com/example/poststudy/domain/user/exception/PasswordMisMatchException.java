package com.example.poststudy.domain.user.exception;

import com.example.poststudy.global.error.exception.CustomException;
import com.example.poststudy.global.error.exception.ErrorCode;

public class PasswordMisMatchException extends CustomException {
    public static final PasswordMisMatchException EXCEPTION = new PasswordMisMatchException();

    public PasswordMisMatchException() {
        super(ErrorCode.PASSWORD_MISMATCH);
    }
}
