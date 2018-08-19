package com.hackaton.isuply.controller;

import com.hackaton.isuply.dto.FavoriteDto;
import com.hackaton.isuply.dto.RestaurantDto;
import com.hackaton.isuply.model.Purveyor;
import com.hackaton.isuply.model.Restaurant;
import com.hackaton.isuply.service.PurveyorService;
import com.hackaton.isuply.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @Autowired
    PurveyorService purveyorService;

    @GetMapping("/getAll")
    /** Lista todos os restaurantes cadastrados */
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAll();
    }


    @GetMapping("/getById/{id}")
    /** Busca um restaurante pelo id */
    public Restaurant getById(@PathVariable(value = "id") Long id) {
        return restaurantService.getById(id);
    }

    @PostMapping("/create/{restaurant}")
    /** Cria um restaurante a partir dos dados enviaods pela api */
    public Restaurant createRestaurant(@Valid @RequestBody RestaurantDto restaurantDto) {

        Restaurant restaurant = new Restaurant();
        restaurant.setContact(restaurantDto.getEmail());
        restaurant.setEmail(restaurantDto.getEmail());
        restaurant.setLat(new BigDecimal(restaurantDto.getLat()));
        restaurant.setLon(new BigDecimal(restaurantDto.getLon()));
        restaurant.setName(restaurantDto.getName());
        restaurant.setSite(restaurantDto.getSite());
        return restaurantService.insert(restaurant);
    }


    @PutMapping("/update/{id}")
    /** Atualiza as inforacoes de um determinado restaurante */
    public Restaurant updateRestaurant(@PathVariable(value = "id") Long id,
                                 @Valid @RequestBody RestaurantDto restaurantDetails) {

        Restaurant restaurant = restaurantService.getById(id);
        restaurant.setContact(restaurantDetails.getEmail());
        restaurant.setEmail(restaurantDetails.getEmail());
        restaurant.setLat(new BigDecimal(restaurantDetails.getLat()));
        restaurant.setLon(new BigDecimal(restaurantDetails.getLon()));
        restaurant.setName(restaurantDetails.getName());
        restaurant.setSite(restaurantDetails.getSite());
        return restaurantService.insert(restaurant);
    }

    @PutMapping("/addFavorite/{favoriteDto}")
    /** Relaciona um restaurante a um fornecedor */
    public void addFavorite(@Valid @RequestBody FavoriteDto favoriteDto) {
        Restaurant restaurant = restaurantService.getById(favoriteDto.getIdRestaurante());
        Purveyor purveyor = purveyorService.getById(favoriteDto.getIdPurvoyor());
        restaurant.getFavorites().add(purveyor);
        restaurantService.insert(restaurant);

    }

}
