package com.example.poststudy.domain.dto.request;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
public class PostRequest {

    @NotBlank
    @Size(min = 5, max = 500)
    private String title;

    @NotBlank
    @Size(max = 5000)
    private String content;
}
