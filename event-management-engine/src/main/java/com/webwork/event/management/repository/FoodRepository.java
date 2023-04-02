package com.webwork.event.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webwork.event.management.entity.Food;

public interface FoodRepository extends JpaRepository<Food, Integer> {

	Object findByName(String name);

	Food save(Food food);

}
