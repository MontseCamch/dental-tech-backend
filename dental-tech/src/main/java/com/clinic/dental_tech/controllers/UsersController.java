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

import com.clinic.dental_tech.models.Users;
import com.clinic.dental_tech.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	@Autowired
	private UserService userService;
	
	//GET
	@GetMapping
	public List<Users> getAllUsers() {
		return userService.findAllUsers();
	}
	
	//GET Single
	@GetMapping("/{id}")
	public ResponseEntity<Users> getUserById(@PathVariable("id") Long id) {
		return userService.findUserById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	//POST
	@PostMapping
	public Users createUser(@RequestBody Users user) {
		return userService.saveUser(user);
	}
	
	//PUT
	
	//DELETE
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable("id") Long id) {
		return userService.findUserById(id)
				.map(user -> {
					userService.deleteUser(id);
					return ResponseEntity.ok().<Void>build();
				})
				.orElse(ResponseEntity.notFound().build());
	}
	
	
	
}
