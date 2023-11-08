package com.example.poststudy.domain.post.presentation.dto.response;

import com.example.poststudy.domain.comment.domin.Comment;
import com.example.poststudy.domain.comment.presentation.response.CommentResponse;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class PostResponse {

    private final String nickname;
    private final String theme;
    private final String title;
    private final String content;
    private final String createDate;
    private final List<CommentResponse> comments;

    @Builder
    public PostResponse(String nickname, String theme, String title, String content, String createDate, List<CommentResponse> comments){
        this.nickname = nickname;
        this.theme = theme;
        this.title = title;
        this.content = content;
        this.createDate = createDate;
        this.comments = comments;
    }
}
