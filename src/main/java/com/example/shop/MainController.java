package com.example.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    MainRepository rep;

    @Autowired
    public MainController(MainRepository rep) {
        this.rep = rep;
    }

    @GetMapping("/")
    public String mainPage(Model model) {

        rep.findAll().forEach(elem -> System.out.println(elem.getName()));
        //model.addAttribute("strHello", );

        System.out.println();

        return "index";
    }
}
