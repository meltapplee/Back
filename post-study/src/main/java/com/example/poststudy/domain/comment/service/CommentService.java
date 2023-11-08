package com.example.poststudy.domain.comment.service;

import com.example.poststudy.domain.comment.domin.Comment;
import com.example.poststudy.domain.comment.exception.CommentNotFoundException;
import com.example.poststudy.domain.comment.domin.repository.CommentRepository;
import com.example.poststudy.domain.comment.presentation.request.CommentRequest;
import com.example.poststudy.domain.post.domain.Post;
import com.example.poststudy.domain.post.domain.repository.PostRepository;
import com.example.poststudy.domain.post.exception.PostNotFoundException;
import com.example.poststudy.domain.post.exception.WriterMismatchException;
import com.example.poststudy.domain.post.presentation.dto.response.ReturnIdResponse;
import com.example.poststudy.domain.user.service.util.UserUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final PostRepository postRepository;
    private final CommentRepository commentRepository;
    private final UserUtil userUtil;

    @Transactional
    public ReturnIdResponse create(CommentRequest request) {
        Post post = postRepository.findById(request.getPostId())
                .orElseThrow(()-> PostNotFoundException.EXCEPTION);

        Comment comment = commentRepository.save(Comment.builder()
                .post(post)
                .user(userUtil.findUser())
                .content(request.getContent())
                .build());

        return new ReturnIdResponse(comment.getId());
    }

    @Transactional
    public Long update(Long id, CommentRequest request) {
        Comment comment = commentRepository.findById(id)
                .orElseThrow(()-> CommentNotFoundException.EXCEPTION);
        if(!comment.getUser().getAccountId().equals(userUtil.getUserId())) throw WriterMismatchException.EXCEPTION;

        return comment.update(request.getContent());
    }

    @Transactional
    public void delete(Long id) {
        Comment comment = commentRepository.findById(id)
                .orElseThrow(()-> CommentNotFoundException.EXCEPTION);
        if(!comment.getUser().getAccountId().equals(userUtil.getUserId())) throw WriterMismatchException.EXCEPTION;

        commentRepository.delete(comment);
    }
}
