package com.example.poststudy.global.security.exception;

import com.example.poststudy.global.error.CustomException;
import com.example.poststudy.global.error.ErrorCode;

public class TokenErrorException extends CustomException {
    public static final CustomException EXCEPTION = new TokenErrorException();

    public TokenErrorException() {
        super(ErrorCode.TOKEN_ERROR);
    }
}
