package com.example.poststudy.domain.post.exception;

import com.example.poststudy.global.error.exception.CustomException;
import com.example.poststudy.global.error.exception.ErrorCode;

public class WriterMismatchException extends CustomException {
    public static final WriterMismatchException EXCEPTION = new WriterMismatchException();

    public WriterMismatchException() {
        super(ErrorCode.WRITER_MISMATCH);
    }
}
