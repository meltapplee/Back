package com.example.poststudy.domain.repository;

import com.example.poststudy.domain.entity.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
