package com.example.poststudy.global.error;

import com.example.poststudy.global.error.exception.CustomException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(CustomException.class)
    protected ResponseEntity<ErrorResponse> HandlerException(CustomException e){

        log.error("[Exception] : " + e.getErrorCode().getMessage(), e);
        return new ResponseEntity<>(new ErrorResponse(e.getErrorCode().getStatus(), e.getErrorCode().getMessage()), HttpStatus.valueOf(e.getErrorCode().getStatus()));

    }

}
