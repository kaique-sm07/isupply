package com.hackaton.isuply.service;

import com.hackaton.isuply.dao.MealDao;
import com.hackaton.isuply.model.Meal;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MealService {

    @Autowired
    private MealDao mealDao;

    /** Busca todos os pratos */
    public List<Meal> getAll() {
        return mealDao.getAll();
    }

}
