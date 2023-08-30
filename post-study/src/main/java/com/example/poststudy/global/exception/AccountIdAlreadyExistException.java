package com.example.poststudy.global.exception;

import com.example.poststudy.global.error.CustomException;
import com.example.poststudy.global.error.ErrorCode;

public class AccountIdAlreadyExistException extends CustomException {

    public final static CustomException EXCEPTION = new AccountIdAlreadyExistException();
    private AccountIdAlreadyExistException() {
        super(ErrorCode.ACCOUNT_ID_ALREADY_EXIST);
    }
}
