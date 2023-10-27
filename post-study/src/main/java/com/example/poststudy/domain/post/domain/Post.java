package com.example.poststudy.domain.post.domain;

import com.example.poststudy.domain.post.domain.type.ThemeType;
import com.example.poststudy.domain.user.domain.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 500)
    private String title;

    @Column(nullable = false, length = 5000)
    private String content;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ThemeType theme;

    @Column(nullable = false)
    private String createDate;

    @ManyToOne
    @JoinColumn(name = "accountId")
    private User user;

    @Builder
    public Post(String title, ThemeType theme, String content) {
        this.title = title;
        this.theme = theme;
        this.content = content;
        this.createDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy년 M월 d일"));
    }

    public void update(String title, ThemeType theme, String content) {
        this.title = title;
        this.theme = theme;
        this.content = content;
    }
}
