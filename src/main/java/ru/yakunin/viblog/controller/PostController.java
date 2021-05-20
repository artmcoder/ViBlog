package ru.yakunin.viblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.yakunin.viblog.repository.PostRepository;

@Controller
public class PostController {
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/")
    public String postsPage(Model model) {
        model.addAttribute("posts", postRepository.findAll());
        return "posts";
    }
}
