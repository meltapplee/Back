package com.example.poststudy.global.exception;

import com.example.poststudy.global.error.CustomException;
import com.example.poststudy.global.error.ErrorCode;

public class PostNotFoundException extends CustomException {

    public final static CustomException EXCEPTION = new PostNotFoundException();
    private PostNotFoundException() {
        super(ErrorCode.POST_NOT_FOUND);
    }
}
