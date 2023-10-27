package com.example.poststudy.domain.post.presentation;

import com.example.poststudy.domain.post.presentation.dto.request.PostRequest;
import com.example.poststudy.domain.post.presentation.dto.response.PostListResponse;
import com.example.poststudy.domain.post.presentation.dto.response.PostResponse;
import com.example.poststudy.domain.post.service.PostService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/post")
@RequiredArgsConstructor
@RestController
public class PostController {
    private final PostService postService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Long create(@RequestBody @Valid PostRequest request) {
        return postService.create(request);
    }

    @PutMapping("/{id}")
    public Long update(@PathVariable @NotNull Long id, @RequestBody @Valid PostRequest request) {
        return postService.update(id, request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable @NotNull Long id) {
        postService.delete(id);
    }

    @GetMapping
    public PostListResponse getAllPost(Pageable page) {
        return postService.getAllPost(page);
    }

    @GetMapping("/{id}")
    public PostResponse getPostById(@PathVariable @NotNull Long id){
        return postService.getPostById(id);
    }
}
