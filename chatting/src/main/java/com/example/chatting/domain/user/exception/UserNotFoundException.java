package com.example.chatting.domain.user.exception;

import com.example.chatting.global.error.exception.BaseException;
import com.example.chatting.global.error.exception.ErrorCode;

public class UserNotFoundException extends BaseException {
    public static final BaseException EXCEPTION = new UserNotFoundException();

    public UserNotFoundException() {
        super(ErrorCode.USER_NOT_FOUND);
    }
}
