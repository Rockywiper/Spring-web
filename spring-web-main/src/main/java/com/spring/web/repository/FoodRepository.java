package com.spring.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.web.model.Food;

public interface FoodRepository extends JpaRepository<Food, Long>{

}
