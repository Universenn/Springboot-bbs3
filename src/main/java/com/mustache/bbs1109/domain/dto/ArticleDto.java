package com.mustache.bbs1109.domain.dto;


import com.mustache.bbs1109.domain.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class ArticleDto {

    private Long id;
    private String title;
    private String content;

    public Article toEntity() {
        return new Article(title, content);
    }
}
