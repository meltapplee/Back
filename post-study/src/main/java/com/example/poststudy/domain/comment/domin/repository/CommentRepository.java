package com.example.poststudy.domain.comment.domin.repository;

import com.example.poststudy.domain.comment.domin.Comment;
import com.example.poststudy.domain.post.domain.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CommentRepository extends CrudRepository<Comment, Long> {
    Optional<Comment> findAllByPostOrderByDate(Post post);
}
