package com.webwork.event.management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "images")
public class Images {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private String id;

	@Column(name = "name")
	private String name;

	@Column(name = "urls")
	private String urls = "http://localhost:8080/public/event/1/0/files/load/";

	@Column(name = "encodedUrls")
	private String encodedUrls = "http://localhost:8080/public/event/1/0/files/load/encoded/";

	public Images() {
	}

	public Images(String name) {
		this.name = name;
		this.urls += name;
		this.encodedUrls += name;
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
		this.urls += name;
		this.encodedUrls += name;
	}

	public String getUrls() {
		return urls;
	}

	public void setUrls(String urls) {
		this.urls = urls;
	}

	public String getEncodedUrls() {
		return encodedUrls;
	}

	public void setEncodedUrls(String encodedUrls) {
		this.encodedUrls = encodedUrls;
	}

	@Override
	public String toString() {
		return "Images [id=" + id + ", name=" + name + ", urls=" + urls + ", encodedUrls=" + encodedUrls + "]";
	}

	
}
