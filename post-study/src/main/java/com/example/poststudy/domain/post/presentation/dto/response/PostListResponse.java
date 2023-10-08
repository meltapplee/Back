package com.example.poststudy.domain.post.presentation.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class PostListResponse {

    private final int totalPage;
    private final List<PostResponse> postResponse;

    @Getter
    @Builder
    public static class PostResponse {
        private final Long id;
        private final String userNickname;
        private final String profile;
        private final String title;
        private final String state;
        private final String major;
        private final String language;
        private final String createDate;
    }
}
