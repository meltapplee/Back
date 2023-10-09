package com.example.poststudy.domain.post.service;

import com.example.poststudy.domain.post.domain.Post;
import com.example.poststudy.domain.post.domain.repository.PostRepository;
import com.example.poststudy.domain.post.domain.type.ThemeType;
import com.example.poststudy.domain.post.presentation.dto.response.PostListResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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

        return new PostListResponse(posts.getTotalPages(), );
    }

    public PostListResponse.PostResponse sort(Post post) {
        return PostListResponse.PostResponse.builder()
                .id(post.getId())
                .userNickname(post.get)
    }
    private final Long id;
    private final String userNickname;
    private final String profile;
    private final String title;
    private final String state;
    private final String major;
    private final String language;
    private final String createDate;
}
