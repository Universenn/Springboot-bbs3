package com.mustache.bbs1109.controller;

import com.mustache.bbs1109.domain.dto.ArticleDto;
import com.mustache.bbs1109.domain.entity.Article;
import com.mustache.bbs1109.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/articles")
@Slf4j
public class ArticleController {

    public final ArticleRepository articleRepository;

    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }


    @GetMapping("/new")
    public String createPage() {
        return "/articles/new";
    }

    @PostMapping("")
    public String add(ArticleDto articleDto) {
        log.info(articleDto.getTitle(), articleDto.getContent());
        Article savedArticle = articleRepository.save(articleDto.toEntity());
        log.info("generatedId:{}", savedArticle.getId());

        // souf %d %s
        return String.format("redirect:/articles/%d", savedArticle.getId());
    }
}
