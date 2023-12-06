package com.example.chatting.domain.user.exception;

import com.example.chatting.global.error.exception.BaseException;
import com.example.chatting.global.error.exception.ErrorCode;

public class UserAlreadyExistException extends BaseException {
    public static final BaseException EXCEPTION = new UserAlreadyExistException();

    public UserAlreadyExistException() {
        super(ErrorCode.ACCOUNT_ID_ALREADY_EXIST);
    }
}
