package com.webwork.event.management.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webwork.event.management.entity.Food;
import com.webwork.event.management.exception.DuplicateEntityException;
import com.webwork.event.management.exception.EntityNotFoundException;
import com.webwork.event.management.repository.FoodRepository;
import com.webwork.event.management.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService {

	@Autowired
	private FoodRepository foodRepo;

	@Override
	public Food save(Food food) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(String foodId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Food> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Food get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Food> saveAll(List<Food> foodList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int foodId) {
		// TODO Auto-generated method stub
		return false;
	}

	

	

}
