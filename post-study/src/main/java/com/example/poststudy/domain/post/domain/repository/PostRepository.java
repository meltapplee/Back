package com.example.poststudy.domain.post.domain.repository;

import com.example.poststudy.domain.post.domain.Post;
import com.example.poststudy.domain.post.domain.type.ThemeType;
import com.example.poststudy.domain.user.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
    Page<Post> findAllByOrderByCreateDateDesc(Pageable page);
    Page<Post> findAllByUserOrderByCreateDate(User user, Pageable page);
    Page<Post> findAllByTitleContainingAndAndThemeOrderByCreateDateDesc(String title, ThemeType theme, Pageable page);
    Page<Post> findAllByTitleContainingOrderByCreateDateDesc(String title, Pageable page);
}
