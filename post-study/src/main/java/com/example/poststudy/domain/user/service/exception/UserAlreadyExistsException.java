package com.example.poststudy.domain.user.service.exception;

import com.example.poststudy.global.error.CustomException;
import com.example.poststudy.global.error.ErrorCode;

public class UserAlreadyExistsException extends CustomException {
    public static final UserAlreadyExistsException EXCEPTION = new UserAlreadyExistsException();

    public UserAlreadyExistsException() {
        super(ErrorCode.USER_ALREADY_EXISTS);
    }
}
