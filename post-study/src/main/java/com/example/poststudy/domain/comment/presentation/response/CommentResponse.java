package com.example.poststudy.domain.comment.presentation.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class CommentResponse {

    private final Long id;
    private final String userNickname;
    private final String content;
    private final String date;

    @Builder
    public CommentResponse(Long id, String userNickname, String content, String date) {
        this.id = id;
        this.userNickname = userNickname;
        this.content = content;
        this.date = date;
    }
}
