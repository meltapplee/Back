package com.example.poststudy.domain.post.presentation.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class PostRequest {

    @NotBlank
    @Size(min = 5, max = 500)
    private String title;

    @NotBlank
    private String theme;

    @NotBlank
    @Size(max = 5000)
    private String content;
}
