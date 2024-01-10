package com.std.sbb.article.controller;

import com.std.sbb.article.entity.Article;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/article")
@Controller
public class ArticleController {

    @GetMapping("/vote")
    public String vote(Model model, Article article){
        model.addAttribute("article", article);
        return "select_vote";
    }

    @PostMapping("/vote")
    @ResponseBody
    public ResponseEntity<Integer> voter(@RequestParam int vote) {
        int update = 1;
        return ResponseEntity.ok(update);
    }

}
