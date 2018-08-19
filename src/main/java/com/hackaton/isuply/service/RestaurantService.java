package com.hackaton.isuply.service;

import com.hackaton.isuply.dao.RestaurantDao;
import com.hackaton.isuply.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RestaurantService {

    @Autowired
    private RestaurantDao restaurantDao;

    /** Busca restaurante por id */
    public Restaurant getById(Long id) {
        return restaurantDao.getById(id);
    }

    /** Busca todos os restaurantes */
    public List<Restaurant> getAll() {
        return restaurantDao.getAll();
    }

    /** Insere restaurante */
    public Restaurant insert(Restaurant restaurant) {
        return restaurantDao.insert(restaurant);
    }

}
