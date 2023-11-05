package com.example.poststudy.domain.post.service;

import com.example.poststudy.domain.post.presentation.dto.request.PostRequest;
import com.example.poststudy.domain.post.presentation.dto.response.PostListResponse;
import com.example.poststudy.domain.post.presentation.dto.response.PostResponse;
import com.example.poststudy.domain.post.domain.Post;
import com.example.poststudy.domain.post.domain.type.ThemeType;
import com.example.poststudy.domain.post.domain.repository.PostRepository;
import com.example.poststudy.domain.user.domain.repository.UserRepository;
import com.example.poststudy.domain.user.service.util.UserUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;
    private final UserUtil userUtil;

    @Transactional
    public Long create(PostRequest request) {
        return postRepository.save(Post.builder()
                .user(userUtil.findUser())
                .title(request.getTitle())
                .content(request.getContent())
                .theme(ThemeType.valueOf(request.getTheme()))
                .build()).getId();
    }

    @Transactional
    public Long update(Long id, PostRequest request) {
        Post post = postRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("존재하지 않는 글 입니다."));
        post.update(request.getTitle(), ThemeType.valueOf(request.getTheme()), request.getContent());
        return post.getId();
    }

    @Transactional
    public void delete(Long id) {
        Post post = postRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("존재하지 않는 글 입니다."));
        postRepository.delete(post);
    }

    @Transactional(readOnly = true)
    public PostListResponse getAllPost(Pageable page) {
        Page<Post> posts = postRepository.findAllByOrderByCreateDateDesc(page);

        return new PostListResponse(posts.getTotalPages(),
                posts.stream().map(post -> PostListResponse.PostResponse.builder()
                        .id(post.getId())
                        .nickname(post.getUser().getNickname())
                        .title(post.getTitle())
                        .theme(String.valueOf(post.getTheme()))
                        .createDate(post.getCreateDate())
                        .build()).collect(Collectors.toList()));
    }

    @Transactional(readOnly = true)
    public PostResponse getPostById(Long id){
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 글 입니다."));
        return PostResponse.builder()
                .nickname(post.getUser().getNickname())
                .theme(String.valueOf(post.getTheme()))
                .title(post.getTitle())
                .content(post.getContent())
                .createDate(post.getCreateDate())
                .build();
    }
}
