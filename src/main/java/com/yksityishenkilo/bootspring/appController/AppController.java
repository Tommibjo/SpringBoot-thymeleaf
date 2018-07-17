/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yksityishenkilo.bootspring.appController;

import ProductPojo.Product;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author tommib
 */
@Controller
public class AppController {

    private ArrayList<Product> list;

    public AppController() {
        this.list = new ArrayList<>();
    }

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("list", this.list);
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String getForm(@RequestParam String product, @RequestParam String details) {
        if (!product.isEmpty() && !details.isEmpty()) {
            this.list.add(new Product(product, details));
        }
        return "redirect:/";
    }

}
