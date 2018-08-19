package com.hackaton.isuply.controller;

import com.hackaton.isuply.model.Meal;
import com.hackaton.isuply.service.MealService;
import com.hackaton.isuply.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/meal")
public class MealController {

    @Autowired
    private MealService mealService;

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/getAll")
    /** Lista todos os pratos cadastrados */
        public List<Meal> getAllMeals() {
        return mealService.getAll();
    }


}
