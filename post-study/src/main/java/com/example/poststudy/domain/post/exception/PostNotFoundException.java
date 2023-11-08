package com.example.poststudy.domain.post.exception;

import com.example.poststudy.global.error.exception.CustomException;
import com.example.poststudy.global.error.exception.ErrorCode;

public class PostNotFoundException extends CustomException {
    public static final PostNotFoundException EXCEPTION = new PostNotFoundException();

    public PostNotFoundException() {
        super(ErrorCode.POST_NOT_FOUND);
    }
}
