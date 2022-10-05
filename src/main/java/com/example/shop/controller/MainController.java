package com.example.shop.controller;

import com.example.shop.entity.Product;
import com.example.shop.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    private final ProductRepo productRepo;

    @Autowired
    public MainController(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @GetMapping("/")
    public String mainPage(Model model) {
     //   Product product1 = new Product();
     //   product1.setName("Мёд");

/*        List<Product> listProducts = new ArrayList<>();
        listProducts.add(product1);*/

    //    productRepo.save(product1);

        model.addAttribute("products", productRepo.findAll());

        return "index";
    }
}
