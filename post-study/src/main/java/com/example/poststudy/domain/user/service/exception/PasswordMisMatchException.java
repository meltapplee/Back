package com.example.poststudy.domain.user.service.exception;

import com.example.poststudy.global.error.CustomException;
import com.example.poststudy.global.error.ErrorCode;

public class PasswordMisMatchException extends CustomException {
    public static final CustomException EXCEPTION = new PasswordMisMatchException();

    public PasswordMisMatchException() {
        super(ErrorCode.PASSWORD_CHECK_MISMATCH);
    }
}
