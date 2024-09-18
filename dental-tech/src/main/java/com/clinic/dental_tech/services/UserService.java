package com.clinic.dental_tech.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.dental_tech.models.Users;
import com.clinic.dental_tech.repository.UsersRepository;

@Service
public class UserService {
	@Autowired
	private UsersRepository usersRepository;
	
	//GET
	public List<Users> findAllUsers(){
		return usersRepository.findAll();
	}
	
	//GET Single
	public Optional<Users> findUserById(Long id)  {
			return usersRepository.findById(id);
	}
	
	//POST
	public Users saveUser(Users user) {
		return usersRepository.save(user);
	}
	
	//PUT
	
	//DELETE
	public void deleteUser(Long id) {
		usersRepository.deleteById(id);
	}
	
	
}
