package com.example.shop.controller;

import com.example.shop.entity.Product;
import com.example.shop.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {

    private final ProductRepo productRepo;

    @Autowired
    public ShopController(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @GetMapping("/shop.html")
    public String shopPage(Model model) {
        model.addAttribute("products", productRepo.findAll());
        return "shop";
    }
}
