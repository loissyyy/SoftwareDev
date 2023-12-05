package com.example.demo.controller;

import com.example.demo.domain.Drink;
import com.example.demo.services.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class DrinkController {
    @Autowired
    DrinkService drinkService;


    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("drinks", drinkService.getAllDrink());
//        model.addAttribute("name", "BOBO");
        return "index";
    }

    @GetMapping("/showNewDrinksForm")
    public String showNewDrinkForm(Model model){
        Drink drink = new Drink();
        model.addAttribute("drink", drink);
        return "new drink";
    }

    @GetMapping("/saveDrink")
    public String saveDrink(@ModelAttribute("drink") Drink drink) {
        drinkService.saveDrink(drink);
        return "redirect:/";
    }

}
