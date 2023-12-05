//package com.example.demo.services;
//
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.swing.text.html.Option;
//import java.util.List;
//import java.util.Optional;
//
//
//@Service
//public class IngredientServiceImpl implements IngredientService{
//    @Autowired
//    IngredientRepository ingredientRepository;
//    @Override
//    public Ingredient saveIngredient(Ingredient ingredient) {
//        return ingredientRepository.save(ingredient);
//    }
//
//    @Override
//    public Ingredient getIngredientById(long id) {
//
//        Optional<Ingredient> ingredient = ingredientRepository.findById(id);
//
//        Ingredient emptyIngredient = null;
//        if(ingredient.isPresent()){
//            emptyIngredient = ingredient.get();
//            return emptyIngredient;
//        }else {
//            throw new RuntimeException("Ingredient not found");
//        }
//
//
//    }
//
//    @Override
//    public List<Ingredient> getAllIngredient() {
//        return ingredientRepository.findAll();
//    }
//
//    @Override
//    public Ingredient updateIngredient(Ingredient ingredient) {
//
//        Optional<Ingredient> optionalIngredient = ingredientRepository.findById(ingredient.getId());
//
//        if(optionalingredient.isPresent()){
//            Ingredient updateIngredient = new Drink();
//            updateIngredient.setCapacity(ingredient.getCapacity());
//            updateIngredient.setColour(drink.getColour());
//            updateIngredient.setCompany(drink.getCompany());
//            updateIngredient.setName(drink.getName());
//            updateIngredient.setType(drink.getType());
//            updateIngredient.setId(drink.getId());
//            updateIngredient.setIngredientList(drink.getIngredientList());
//
//            drinkRepository.save(updateDrink);
//
//            return updateDrink;
//
//
//
//
//        }else{
//            throw new RuntimeException("Drink does not exist");
//        }
//
//    }
//
//    @Override
//    public Drink deleteDrink(long id) {
//        drinkRepository.deleteById(id);
//        return null;
//    }
//}
