package com.example.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainConroller {

    @GetMapping("/about.html")
    public String getAbout() {
        return "about";
    }

    @GetMapping("/shop.html")
    public String getShop() {
        return "shop";
    }
}
