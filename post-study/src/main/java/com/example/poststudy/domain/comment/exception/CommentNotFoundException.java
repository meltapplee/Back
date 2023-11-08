package com.example.poststudy.domain.comment.exception;

import com.example.poststudy.global.error.exception.CustomException;
import com.example.poststudy.global.error.exception.ErrorCode;

public class CommentNotFoundException extends CustomException {
    public static final CommentNotFoundException EXCEPTION = new CommentNotFoundException();

    public CommentNotFoundException() {
        super(ErrorCode.COMMENT_NOT_FOUND);
    }
}
