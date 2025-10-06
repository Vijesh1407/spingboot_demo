package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.service.AdService;

@Controller
public class HomeController {

    private final AdService adService;

    public HomeController(AdService adService) {
        this.adService = adService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("ads", adService.getAllAds());
        return "home";  // points to templates/home.html
    }
}
