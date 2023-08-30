package com.example.poststudy.global.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    USER_NOT_MATCH(403, "작성자와 일치하지 않습니다"),
    POST_NOT_FOUND(404, "게시글이 존재하지 않습니다"),
    REFRESH_TOKEN_NOT_FOUND(404, "Refresh Token Not Found"),
    ACCOUNT_ID_ALREADY_EXIST(409, "유저 아이디가 이미 존재합니다");


    private final int status;
    private final String message;

}
