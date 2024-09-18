package com.clinic.dental_tech.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.dental_tech.models.Orders;
import com.clinic.dental_tech.repository.OrdersRepository;

@Service
public class OrderService {
	@Autowired
	private OrdersRepository ordersRepository;
	
	//GET
	public List<Orders> findAllOrders() {
		return ordersRepository.findAll();
	}
	
	//GET Single
	public Optional<Orders> findOrderById(Long id){
		return ordersRepository.findById(id);
	}
	
	//POST
	public Orders saveOrder(Orders order) {
		return ordersRepository.save(order);
	}
	
	//PUT
	
	//DELETE
	public void deleteOrder(Long id) {
		ordersRepository.deleteById(id);
	}
	
}
