package com.webwork.event.management.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.webwork.event.management.entity.Images;
import com.webwork.event.management.enums.FoodType;

public class FoodDTO {

	private int id;

	private String name;

	private float price;

	private FoodType foodType;

	private String imageFile;


	public FoodDTO() {
	}


	public FoodDTO(int id, String name, float price, FoodType foodType, String imageFile) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.foodType = foodType;
		this.imageFile = imageFile;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public FoodType getFoodType() {
		return foodType;
	}


	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}


	public String getImageFile() {
		return imageFile;
	}


	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}


	@Override
	public String toString() {
		return "FoodDTO [id=" + id + ", name=" + name + ", price=" + price + ", foodType=" + foodType + ", imageFile="
				+ imageFile + "]";
	}
	
	
	
	

}
