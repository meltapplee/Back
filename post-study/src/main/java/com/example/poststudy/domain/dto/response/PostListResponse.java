package com.example.poststudy.domain.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class PostListResponse {

    private final int totalPage;
    private final List<PostResponse> postResponse;

    @Builder
    public static class PostResponse {

        private final Long id;
        private final String title;
        private final String createDate;

        @Builder
        public PostResponse(Long id, String title, String createDate) {
            this.id = id;
            this.title = title;
            this.createDate = createDate;
        }
    }
}
