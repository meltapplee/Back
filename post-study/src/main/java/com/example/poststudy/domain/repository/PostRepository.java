package com.example.poststudy.domain.repository;

import com.example.poststudy.domain.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
    Page<Post> findAllByOrderByCreateDateDesc(Pageable page);
}
