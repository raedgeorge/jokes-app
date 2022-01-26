package com.atech.controllers;

import com.atech.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getQuote(Model theModel){

        String quote = jokeService.getRandomQuote();
        System.out.println(quote);
        theModel.addAttribute("joke", quote);

        return "page";
    }
}
