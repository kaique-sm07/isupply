package com.hackaton.isuply.repository;

import com.hackaton.isuply.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
