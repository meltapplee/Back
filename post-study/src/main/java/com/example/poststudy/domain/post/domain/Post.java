package com.example.poststudy.domain.post.domain;

import com.example.poststudy.domain.post.domain.type.ThemeType;
import com.example.poststudy.domain.user.domain.User;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    public Post(User user, String title, ThemeType theme, String content) {
        this.user = user;
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
