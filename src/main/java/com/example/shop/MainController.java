package com.example.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private final MainRepository repo;

    @Autowired
    public MainController(MainRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/product")
    public String mainPage(Model model) {

        var result = repo.findAll();

        model.addAttribute("products", result);


        return "product";
    }
}
