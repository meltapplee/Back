package com.example.poststudy.domain.user.service.exception;

import com.example.poststudy.global.error.CustomException;
import com.example.poststudy.global.error.ErrorCode;

public class AccountIdAlreadyExistException extends CustomException {
    public static final AccountIdAlreadyExistException EXCEPTION = new AccountIdAlreadyExistException();

    public AccountIdAlreadyExistException() {
        super(ErrorCode.USER_ALREADY_EXISTS);
    }
}
