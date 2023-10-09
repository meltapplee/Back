package com.example.poststudy.global.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    // Bad Request
    BAD_REQUEST(400, "잘못된 요청입니다."),
    PASSWORD_CHECK_MISMATCH(400,"비밀번호가 일치하지 않습니다."),

    // UnAuthorized
    EXPIRED_TOKEN(401 , "Expired token"),
    INVALID_TOKEN(401, "Invalid token"),
    NOT_ACCESS_TOKEN(401, "access 토큰이 아닙니다."),
    TOKEN_ERROR(401, "토큰이 잘못되지 않았는지 확인해주세요."),
    TOKEN_UNAUTHORIZED(401,"토큰이 승인 되지 않습니다."),
    JWT_INVALID(401, "토큰이 유효하지 않습니다."),

    // Forbidden
    BOARD_WRITER_MISMATCH(403, "작성자가 일치하지 않습니다"),
    NO_PERMISSION(403, "권한이 없습니다."),
    INVALID_MAIL(403, "인증되지 않은 메일 주소입니다."),

    // Not Found
    USER_NOT_FOUND(404,"찾을 수 없는 유저입니다."),
    BOARD_NOT_FOUND(404, "찾을 수 없는 게시글 입니다."),
    TOKEN_NOT_FOUND(404, "찾을 수 없는 토큰 입니다."),
    UNAUTHENTICATED_MAIL(404, "인증 코드가 만료되었거나 발급된 적 없는 메일입니다."),

    // Conflict
    USER_ALREADY_EXISTS(409, "이미 유저 아이디가 존재합니다."),

    // Internal Server Error
    INTERNAL_SERVER_ERROR(500, "Internal server error");


    private final int status;
    private final String message;

}
