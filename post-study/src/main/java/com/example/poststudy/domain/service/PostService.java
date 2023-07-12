package com.example.poststudy.domain.service;

import com.example.poststudy.domain.dto.request.PostRequest;
import com.example.poststudy.domain.entity.Post;
import com.example.poststudy.domain.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;

    @Transactional
    public Long create(PostRequest request) {
        return postRepository.save(Post.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .build()).getId();
    }

    @Transactional
    public Long update(Long id, PostRequest request) {
        Post post = postRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("존재하지 않는 글 입니다."));
        post.update(request.getTitle(), request.getContent());
        return post.getId();
    }
}
