package com.example.poststudy.domain.comment.presentation.request;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
public class CommentRequest {

    @NotNull
    private Long postId;

    @NotBlank
    @Size(min = 5, max = 200)
    private String content;
}
