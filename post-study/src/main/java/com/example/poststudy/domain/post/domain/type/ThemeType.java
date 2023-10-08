package com.example.poststudy.domain.post.domain.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ThemeType {
    NOVEL("소설"), TRAVEL("여행"), ESSAY("에세이"), COOKING("요리"), IT("IT");

    private final String theme;
}
