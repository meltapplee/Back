package com.example.poststudy.domain.post.service;

import com.example.poststudy.domain.post.domain.Post;
import com.example.poststudy.domain.post.domain.repository.PostRepository;
import com.example.poststudy.domain.post.domain.type.ThemeType;
import com.example.poststudy.domain.post.presentation.dto.response.PostListResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostListService {
    private final PostRepository postRepository;

    public PostListResponse findPost(String title, String theme, Pageable page){
        Page<Post> posts;
        if(!theme.isEmpty()) {
            posts = postRepository.findAllByTitleContainingAndAndThemeOrderByCreateDateDesc(title, ThemeType.valueOf(theme), page);
        }
        else {
            posts = postRepository.findAllByTitleContainingOrderByCreateDateDesc(title, page);
        }

        return new PostListResponse(posts.getTotalPages(), posts.stream().map(this::sort).collect(Collectors.toList()));
    }

    public PostListResponse.PostResponse sort(Post post) {
        return PostListResponse.PostResponse.builder()
                .id(post.getId())
                .nickname(post.getUser().getNickname())
                .title(post.getTitle())
                .theme(String.valueOf(post.getTheme()))
                .createDate(post.getCreateDate())
                .build();
    }
}
