package com.example.poststudy.global.security.exception;

import com.example.poststudy.global.error.CustomException;
import com.example.poststudy.global.error.ErrorCode;

public class NotAccessTokenException extends CustomException {
    public static final CustomException EXCEPTION = new NotAccessTokenException();

    public NotAccessTokenException() {
        super(ErrorCode.NOT_ACCESS_TOKEN);
    }
}
