package com.example.poststudy.domain.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class PostResponse {

    private final String title;
    private final String content;
    private final String createDate;

    @Builder
    public PostResponse(String title, String content, String createDate){
        this.title = title;
        this.content = content;
        this.createDate = createDate;
    }
}
