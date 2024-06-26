package com.webwork.event.management.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webwork.event.management.converter.Converter;
import com.webwork.event.management.dto.FoodDTO;
import com.webwork.event.management.dto.ResponseMessage;
import com.webwork.event.management.entity.Food;
import com.webwork.event.management.service.FoodService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/private/event/1/0/food")
public class FoodController {

	@Autowired
	private FoodService foodService;

	private Converter<FoodDTO, Food> convert;

	@PostMapping("/add")
	public ResponseEntity<?> addFood(@Valid @RequestBody FoodDTO foodDto) {
		Food food = (Food) convert.convertFromDto(foodDto);
		food = foodService.save(food);
		foodDto = (FoodDTO) convert.convertFromEntity(food);
		return new ResponseEntity<>(foodDto, HttpStatus.OK);
	}

	@PostMapping("/add/all")
	public ResponseEntity<?> addAllFood(@Valid @RequestBody List<FoodDTO> foodDtoList) {
		List<Food> foodList = convert.createfromDtos(foodDtoList);
		foodList = foodService.saveAll(foodList);
		foodDtoList = convert.createFromEntities(foodList);
		return new ResponseEntity<>(foodDtoList, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{foodId}")
	public ResponseEntity<?> deleteFood(@PathVariable String foodId) {
		ResponseMessage message = null;
		if (!foodService.delete(foodId)) {
			message = new ResponseMessage("Not Deleted..!");
		} else {
			message = new ResponseMessage("Deleted Successfull..!");
		}
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
	@GetMapping("/get/all")
	public ResponseEntity<?> getAllFood(){
		List<Food> foodList = null;
		
		return new ResponseEntity<>(foodList, HttpStatus.OK);
	}
}
