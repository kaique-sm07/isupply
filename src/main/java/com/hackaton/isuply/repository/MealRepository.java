package com.hackaton.isuply.repository;

import com.hackaton.isuply.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {

}
