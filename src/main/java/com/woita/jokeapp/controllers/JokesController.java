package com.woita.jokeapp.controllers;

import com.woita.jokeapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mcbrydr on 08/08/19
 */
@Controller
public class JokesController {

    private JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", this.jokeService.getJoke());
        return "chuckNorris";
    }
}
