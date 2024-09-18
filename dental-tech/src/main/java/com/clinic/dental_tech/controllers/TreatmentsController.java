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

import com.clinic.dental_tech.models.Treatments;
import com.clinic.dental_tech.services.TreatmentService;

@RestController
@RequestMapping("/api/treatments")
public class TreatmentsController {

	@Autowired
	private TreatmentService treatmentService;
	
	//GET
	@GetMapping
	public List<Treatments> getAllTreatments() {
		return treatmentService.findAllTreatments();
	}
	
	//GET Single
	@GetMapping("/{id}")
	public ResponseEntity<Treatments> getTreatmentById(@PathVariable("id") Long id) {
		return treatmentService.findTreatmentById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	//POST
	@PostMapping
	public Treatments createTreatment(@RequestBody Treatments treatment) {
		return treatmentService.saveTreatment(treatment);
	}
	
	//PUT
	
	//DELELTE
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteTreatment(@PathVariable("id") Long id) {
		return treatmentService.findTreatmentById(id)
				.map(treatment -> {
					treatmentService.deleteTreatment(id);
					return ResponseEntity.ok().<Void>build();
				})
				.orElse(ResponseEntity.notFound().build());
	}
	
	
	
}
