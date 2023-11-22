package com.example.demo.repository;

import com.example.demo.domain.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DrinkRepository  extends JpaRepository<Drink, Long> {

    List<Drink> findDrinkByPriceGreaterThan(int price);
}
