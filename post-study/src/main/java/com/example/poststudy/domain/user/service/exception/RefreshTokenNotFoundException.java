package com.example.poststudy.domain.user.service.exception;

import com.example.poststudy.global.error.CustomException;
import com.example.poststudy.global.error.ErrorCode;

public class RefreshTokenNotFoundException extends CustomException {
    public static final RefreshTokenNotFoundException EXCEPTION = new RefreshTokenNotFoundException();

    public RefreshTokenNotFoundException() {
        super(ErrorCode.REFRESH_NOT_FOUND);
    }
}
