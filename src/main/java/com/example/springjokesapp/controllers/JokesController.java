package com.example.springjokesapp.controllers;

import com.example.springjokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokesService.getJoke());
        model.addAttribute("date",new Date());
        return "index";
    }
}
