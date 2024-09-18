package com.clinic.dental_tech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinic.dental_tech.models.Products;
import com.clinic.dental_tech.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	@Autowired
	private ProductService productService;
	
	//GET
	@GetMapping
	public List<Products> getAllProducts() {
		return productService.findAllProducts();
	}
	
	//GET Single
	@GetMapping("/{id}")
	public ResponseEntity<Products> getProductById(@PathVariable("id") Long id) {
		return productService.findProductById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	//POST
	@PostMapping
	public Products createProduct(@RequestBody Products product) {
		return productService.saveProduct(product);
	}
	
	//PUT
	
	//DELETE
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteProduct(@PathVariable("id") Long id) {
		return productService.findProductById(id)
				.map(product -> {
					productService.deleteProduct(id);
					return ResponseEntity.ok().<Void>build();
				})
				.orElse(ResponseEntity.notFound().build());
	}
	
	
}
