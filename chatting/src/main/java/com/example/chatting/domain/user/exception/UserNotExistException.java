package com.example.chatting.domain.user.exception;

import com.example.chatting.global.error.exception.BaseException;
import com.example.chatting.global.error.exception.ErrorCode;

public class UserNotExistException extends BaseException {
    private static final BaseException EXCEPTION = new UserNotExistException();

    public UserNotExistException() {
        super(ErrorCode.USER_NOT_FOUND);
    }
}
