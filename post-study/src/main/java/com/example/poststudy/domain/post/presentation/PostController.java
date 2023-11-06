package com.example.poststudy.domain.post.presentation;

import com.example.poststudy.domain.post.presentation.dto.request.PostRequest;
import com.example.poststudy.domain.post.presentation.dto.response.PostListResponse;
import com.example.poststudy.domain.post.presentation.dto.response.PostResponse;
import com.example.poststudy.domain.post.service.PostListService;
import com.example.poststudy.domain.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RequestMapping("/post")
@RequiredArgsConstructor
@RestController
public class PostController {
    private final PostService postService;
    private final PostListService postListService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Long create(@RequestBody @Valid PostRequest request) {
        System.out.println(request.getTheme());
        return postService.create(request);
    }

    @PatchMapping("/{id}")
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
    public PostResponse getPostDetails(@PathVariable @NotNull Long id){
        return postService.getPostById(id);
    }

    @GetMapping("/user")
    public PostListResponse getPostByUser(Pageable pageable) {
        return postListService.findPostByUser(pageable);
    }

    @GetMapping("/search")
    public PostListResponse search(@RequestParam(value = "theme") String theme, @RequestParam(value = "title") String title, Pageable pageable) {
        return postListService.findPost(title, theme, pageable);
    }
}
