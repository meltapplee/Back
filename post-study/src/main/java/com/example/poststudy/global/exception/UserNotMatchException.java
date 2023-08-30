package com.example.poststudy.global.exception;

import com.example.poststudy.global.error.CustomException;
import com.example.poststudy.global.error.ErrorCode;

public class UserNotMatchException extends CustomException {

    public final static CustomException EXCEPTION = new UserNotMatchException();
    private UserNotMatchException() {
        super(ErrorCode.USER_NOT_MATCH);
    }
}
