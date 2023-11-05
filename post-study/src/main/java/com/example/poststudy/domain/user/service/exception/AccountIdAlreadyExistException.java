package com.example.poststudy.domain.user.service.exception;

import com.example.poststudy.global.error.exception.CustomException;
import com.example.poststudy.global.error.exception.ErrorCode;

public class AccountIdAlreadyExistException extends CustomException {
    public static final AccountIdAlreadyExistException EXCEPTION = new AccountIdAlreadyExistException();
    public AccountIdAlreadyExistException() {
        super(ErrorCode.USER_ALREADY_EXISTS);
    }
}
