package com.example.poststudy.domain.comment.domin;

import com.example.poststudy.domain.post.domain.Post;
import com.example.poststudy.domain.user.domain.User;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String date;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Builder
    public Comment(Post post, User user, String content) {
        this.post = post;
        this.user = user;
        this.content = content;
        this.date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
    }

    public Long update(String content) {
        this.content = content;
        return this.id;
    }
}
