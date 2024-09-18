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

import com.clinic.dental_tech.models.Doctors;
import com.clinic.dental_tech.services.DoctorService;

@RestController
@RequestMapping("/api/doctors")
public class DoctorsController {
	
	@Autowired
	private DoctorService doctorService;
	
	//GET
	@GetMapping
	public List<Doctors> getAllDoctors() {
		return doctorService.findAllDoctors();
	}
	
	//GET Single
	@GetMapping("/{id}")
	public ResponseEntity<Doctors> getDoctorById(@PathVariable ("id") Long id) {
		return doctorService.findDoctorById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	//POST
	@PostMapping
	public Doctors createDoctor(@RequestBody Doctors doctor) {
		return doctorService.saveDoctor(doctor);
	}
	
	//PUT
	
	//DELETE
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteDoctor(@PathVariable("id") Long id) {
		return doctorService.findDoctorById(id)
				.map(doctor -> {
					doctorService.deleteDoctor(id);
					return ResponseEntity.ok().<Void>build();
				})
				.orElse(ResponseEntity.notFound().build());
	}
	
}
