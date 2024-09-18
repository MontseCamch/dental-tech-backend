package com.clinic.dental_tech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinic.dental_tech.models.Orders;
import com.clinic.dental_tech.services.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {
	
	@Autowired
	private OrderService orderService;
	
	//GET
	@GetMapping
	public List<Orders> getAllOrders() {
		return orderService.findAllOrders();
	}
	
	//GET Single
	@GetMapping("/{id}")
	public ResponseEntity<Orders> getOrderById(@PathVariable("id") Long id) {
		return orderService.findOrderById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	
	//POST
	public Orders createOrder(@RequestBody Orders order) {
		return orderService.saveOrder(order);
	}
	
	//PUT
	
	//DELETE
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteOrder(@PathVariable ("id") Long id) {
		return orderService.findOrderById(id)
				.map(order -> {
					orderService.deleteOrder(id);
					return ResponseEntity.ok().<Void>build();
				})
				.orElse(ResponseEntity.notFound().build());
	}
	
	
}
