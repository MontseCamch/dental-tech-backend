package com.clinic.dental_tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clinic.dental_tech.models.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long>{
	
}
