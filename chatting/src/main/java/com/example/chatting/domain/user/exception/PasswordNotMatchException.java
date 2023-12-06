package com.example.chatting.domain.user.exception;

import com.example.chatting.global.error.exception.BaseException;
import com.example.chatting.global.error.exception.ErrorCode;

public class PasswordNotMatchException extends BaseException {
    public static final BaseException EXCEPTION = new PasswordNotMatchException();

    public PasswordNotMatchException() {
        super(ErrorCode.PASSWORD_MISMATCH);
    }
}
