package com.webwork.event.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webwork.event.management.entity.Images;

public interface ImagesRepository extends JpaRepository<Images, String> {

	void deleteByName(String fileName);

}
