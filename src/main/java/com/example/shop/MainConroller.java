package com.example.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainConroller {

    private final ShopRepository repo;

    @Autowired
    public MainConroller(ShopRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/about.html")
    public String getAboutPage() {
        return "about";
    }

    @GetMapping("/contact.html")
    public String getContactPage() {
        return "contact";
    }

    @GetMapping("/shop.html")
    public String getShopPage(Model model) {

        model.addAttribute("listProduct", repo.findAll());

        // Это сами создаем объекты и передаем их в список
/*        Product honey = new Product();
        honey.setId(1);
        honey.setName("Мёд");
        honey.setAmount(100);

        Product propolis = new Product();
        propolis.setId(2);
        propolis.setName("Прополис");
        propolis.setAmount(200);

        Product wildHoney = new Product();
        wildHoney.setId(3);
        wildHoney.setName("Разнотравье");
        wildHoney.setAmount(1000);

        List products = new ArrayList();
        products.add(honey);
        products.add(propolis);
        products.add(wildHoney);

        model.addAttribute("listProduct", products);*/




        return "shop";
    }
}
