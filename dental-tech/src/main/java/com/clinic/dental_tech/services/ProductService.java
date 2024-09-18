package com.clinic.dental_tech.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.dental_tech.models.Products;
import com.clinic.dental_tech.repository.ProductsRepository;

@Service
public class ProductService {
	@Autowired
	private ProductsRepository productsRepository;
	
	//GET
	public List<Products> findAllProducts() {
		return productsRepository.findAll();
	}
	
	//GET Single
	public Optional <Products> findProductById(Long id) {
		return productsRepository.findById(id);
	}
	
	//POST
	public Products saveProduct(Products product) {
		return productsRepository.save(product);
	}
	
	//PUT
	
	//DELETE
	public void deleteProduct(Long id) {
		productsRepository.deleteById(id);
	}
	
}
