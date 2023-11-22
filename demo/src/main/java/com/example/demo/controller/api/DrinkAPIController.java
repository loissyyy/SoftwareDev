package com.example.demo.controller.api;

import com.example.demo.domain.Drink;
import com.example.demo.repository.DrinkRepository;
import com.example.demo.services.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class DrinkAPIController {

    @Autowired
    DrinkRepository drinkRepository;

    @Autowired
    DrinkService drinkService;

    @RequestMapping("/drinks")
    @GetMapping("/drinks")
    public ResponseEntity<List<Drink>> getAllDrinks(){
        return ResponseEntity.ok().body(drinkService.getAllDrink());
    }

    @PostMapping("/drinks")
    public ResponseEntity<Drink> saveDrink(@RequestBody Drink drink){
        return ResponseEntity.ok().body(drinkService.saveDrink(drink));
    }

}
