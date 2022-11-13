package com.example.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainConroller {

    private final MainRepository repo;

    @Autowired
    public MainConroller(MainRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/about.html")
    public String getAbout() {
        return "about";
    }

    @GetMapping("/shop.html")
    public String getShop(Model model) {

/*        Product honey = new Product();
        honey.setId(1);
        honey.setName("Мёд");
        honey.setAmount(100);

        Product propolis = new Product();
        propolis.setId(2);
        propolis.setName("Прополис");
        propolis.setAmount(200);

        List products = new ArrayList();
        products.add(honey);
        products.add(propolis);

        model.addAttribute("myValue", products);*/

        model.addAttribute("products", repo.findAll());

        return "shop";
    }
}
