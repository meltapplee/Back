package com.example.poststudy.domain.post.presentation.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class PostResponse {

    private final String nickname;
    private final String theme;
    private final String title;
    private final String content;
    private final String createDate;

    @Builder
    public PostResponse(String nickname, String theme, String title, String content, String createDate){
        this.nickname = nickname;
        this.theme = theme;
        this.title = title;
        this.content = content;
        this.createDate = createDate;
    }
}
