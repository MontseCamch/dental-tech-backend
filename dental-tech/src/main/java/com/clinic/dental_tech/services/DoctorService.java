package com.clinic.dental_tech.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.dental_tech.models.Doctors;
import com.clinic.dental_tech.repository.DoctorsRepository;

@Service
public class DoctorService {
	@Autowired
	private DoctorsRepository doctorsRepository;
	
	//GET
	public List<Doctors> findAllDoctors() {
		return doctorsRepository.findAll();
	}
	
	//GET Single
	public Optional <Doctors> findDoctorById(Long id){
		return doctorsRepository.findById(id);
	}
	
	//POST
	public Doctors saveDoctor(Doctors doctor) {
		return doctorsRepository.save(doctor);
	}
	
	//PUT
	
	//DELETE
	public void deleteDoctor(Long id) {
		doctorsRepository.deleteById(id);
	}
	
	
}
