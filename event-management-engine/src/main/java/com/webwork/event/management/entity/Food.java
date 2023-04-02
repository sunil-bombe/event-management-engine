package com.webwork.event.management.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.webwork.event.management.enums.FoodType;

//@Document
@Entity
@Table(name="food")
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name="name")
	private String name;

	@Column(name="price")
	private float price;

	@Column(name="foodType")
	private FoodType foodType;

	@Column(name="imageFile")
	private String imageFile;


	public Food() {
	}


	public Food(int id, String name, float price, FoodType foodType, String imageFile) {
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
		return "Food [id=" + id + ", name=" + name + ", price=" + price + ", foodType=" + foodType + ", imageFile="
				+ imageFile + "]";
	}
	
	


	
}
