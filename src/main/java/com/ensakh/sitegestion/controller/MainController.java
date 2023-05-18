package com.ensakh.sitegestion.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @GetMapping("/login")
    public String login(Model model){
        return "login";
    }

    @RequestMapping("/")
    public String home(Model model) {
        return "home";
    }
    @RequestMapping("/home")
    public String home1(Model model) {
        return "home";
    }
    @GetMapping("/note")
    public String notes(Model model){
        return "saisie notes";
    }



}