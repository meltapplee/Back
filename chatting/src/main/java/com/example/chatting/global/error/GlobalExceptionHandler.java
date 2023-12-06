package com.example.chatting.global.error;

import com.example.chatting.global.error.exception.BaseException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ValidationException;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BaseException.class)
    protected ResponseEntity<ErrorResponse> UphandlerException(BaseException e) {
        log.error("[UpException] : " + e.getErrorCode().getErrorMessage(), e);
        return new ResponseEntity<>(new ErrorResponse(e.getErrorCode().getStatusCode(), e.getErrorCode().getErrorMessage()), HttpStatus.valueOf(e.getErrorCode().getStatusCode()));
    }

    @ExceptionHandler(NullPointerException.class)
    protected ResponseEntity<ErrorResponse> handleNullPointException(NullPointerException e) {
        log.error("[NullPointerException] : " + e.getMessage(), e);
        return new ResponseEntity<>(new ErrorResponse(400, "요청한 작업을 위해 필요한 정보가 존재하지 않아 예외가 발생하였습니다."), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ValidationException.class)
    protected ResponseEntity<ErrorResponse> handleValidationException(ValidationException e) {
        log.error("[ValidationException] : " + e.getMessage(), e);
        return new ResponseEntity<>(new ErrorResponse(400, e.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<ErrorResponse> handleException(Exception e) {
        log.error("[exception] : " + e.getMessage(), e);
        return new ResponseEntity<>(new ErrorResponse(500, e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}