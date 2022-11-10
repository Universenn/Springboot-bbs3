package com.mustache.bbs1109.repository;

import com.mustache.bbs1109.domain.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
