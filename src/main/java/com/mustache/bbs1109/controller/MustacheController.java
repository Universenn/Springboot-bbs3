package com.mustache.bbs1109.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class MustacheController {

    @GetMapping("/haha")
    public String createPage(Model model) {
        model.addAttribute("username", "우주완");
        return "juwan";
    }
}
