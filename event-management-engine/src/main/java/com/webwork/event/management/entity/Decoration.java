package com.webwork.event.management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.webwork.event.management.enums.EventType;

@Entity
@Table(name = "decoration")
public class Decoration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private String id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;
	
	@Column(name = "decorationSize")
	private String decorationSize;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "eventType")
	private EventType eventType;
	
	@Column(name = "imagesFile")
	private String imagesFile;
	
	private int rId;

	public Decoration() {
	}

	public Decoration(String id, String name, String description, String decorationSize, int price, EventType eventType,
			String imagesFile, int rId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.decorationSize = decorationSize;
		this.price = price;
		this.eventType = eventType;
		this.imagesFile = imagesFile;
		this.rId = rId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDecorationSize() {
		return decorationSize;
	}

	public void setDecorationSize(String decorationSize) {
		this.decorationSize = decorationSize;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public EventType getEventType() {
		return eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	public String getImagesFile() {
		return imagesFile;
	}

	public void setImagesFile(String imagesFile) {
		this.imagesFile = imagesFile;
	}

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	@Override
	public String toString() {
		return "Decoration [id=" + id + ", name=" + name + ", description=" + description + ", decorationSize="
				+ decorationSize + ", price=" + price + ", eventType=" + eventType + ", imagesFile=" + imagesFile
				+ ", rId=" + rId + "]";
	}
	
	

	
	
}
