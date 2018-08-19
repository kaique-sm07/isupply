package com.hackaton.isuply.dao;

import com.hackaton.isuply.exception.ResourceNotFoundException;
import com.hackaton.isuply.model.Restaurant;
import com.hackaton.isuply.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RestaurantDao {

    @Autowired
    RestaurantRepository restaurantRepository;

    /** Busca um restaurant pelo id */
    public Restaurant getById(Long id) {
        return restaurantRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Restaurant", "id", id));
    }

    /** Busca todos os restaurantes */
    public List<Restaurant> getAll() {
        return restaurantRepository.findAll();
    }

    /** Insere um restaurante no banco */
    public Restaurant insert(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }
}
