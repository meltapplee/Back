package com.example.poststudy.global.exception;

import com.example.poststudy.global.error.CustomException;
import com.example.poststudy.global.error.ErrorCode;

public class RefreshTokenNotFoundException extends CustomException {

    public final static CustomException EXCEPTION = new RefreshTokenNotFoundException();
    private RefreshTokenNotFoundException() {
        super(ErrorCode.REFRESH_TOKEN_NOT_FOUND);
    }
}
