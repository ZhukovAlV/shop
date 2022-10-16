package com.example.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    private final MainRepository repo;

    @Autowired
    public MainController(MainRepository repo) {
        this.repo = repo;
    }


    @GetMapping("/contact.html")
    public String getContactPage() {
        return "contact";
    }

    @GetMapping("/shop.html")
    public String getShopPage(Model model) {

/*        List<Product> allProducts = new ArrayList<>();

        Product honey = new Product();
        honey.setId(10L);
        honey.setName("honey");
        honey.setAmount(12);

        Product propolis = new Product();
        propolis.setId(11L);
        propolis.setName("propolis");
        propolis.setAmount(120);

        allProducts.add(honey);
        allProducts.add(propolis);

        model.addAttribute("products", allProducts);*/

        model.addAttribute("products", repo.findAll());

        return "shop";
    }

 /*   @GetMapping("/product")
    public String mainPage(Model model) {


        var result = repo.findAll();

        model.addAttribute("products", result);


        return "product";
    } */
}
