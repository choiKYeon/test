package com.std.sbb.article.service;


import com.std.sbb.article.entity.Article;
import com.std.sbb.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    public int vote(int vote){
        Article article = new Article();
        article.setVote(vote);
        articleRepository.save(article);

        return getTotalVoteCount();
    }
    private int getTotalVoteCount() {
        return 1;
    }
}
