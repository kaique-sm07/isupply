package com.hackaton.isuply.dao;

import com.hackaton.isuply.model.Meal;
import com.hackaton.isuply.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MealDao {

    @Autowired
    private MealRepository mealRepository;

    /** Busca no banco a lista de todos os pratos */
    public List<Meal> getAll() {
        return mealRepository.findAll();
    }
}
