package com.example.poststudy.global.error;

import com.example.poststudy.global.error.exception.CustomException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ValidationException;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    protected ResponseEntity<ErrorResponse> handlerException(CustomException e){

        log.error("[Exception] : " + e.getErrorCode().getMessage(), e);
        return new ResponseEntity<>(new ErrorResponse(e.getErrorCode().getStatus(), e.getErrorCode().getMessage()), HttpStatus.valueOf(e.getErrorCode().getStatus()));

    }

    @ExceptionHandler(ValidationException.class)
    protected ResponseEntity<ErrorResponse> handleValidationException(ValidationException e) {
        log.error("[ValidationException] : " + e.getMessage(), e);
        return new ResponseEntity<>(new ErrorResponse(400, e.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NullPointerException.class)
    protected ResponseEntity<ErrorResponse> handleNullPointException(NullPointerException e) {
        log.error("[NullPointerException] : " + e.getMessage(), e);
        return new ResponseEntity<>(new ErrorResponse(400, "작업을 수행하기 위한 정보가 충분하지 않습니다"), HttpStatus.BAD_REQUEST);

    }

}
