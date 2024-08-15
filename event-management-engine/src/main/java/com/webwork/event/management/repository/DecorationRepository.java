package com.webwork.event.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webwork.event.management.entity.Decoration;

public interface DecorationRepository extends JpaRepository<Decoration, String> {

	Object findByName(String name);

}
