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

import com.clinic.dental_tech.models.Patients;
import com.clinic.dental_tech.services.PatientService;

@RestController
@RequestMapping("/api/patients")
public class PatientsController {

	@Autowired
	private PatientService patientService;
	
	//GET
	@GetMapping
	public List<Patients> getAllPatients() {
		return patientService.findAllPatients();
	}
	
	//GET Single
	@GetMapping("/{id}")
	public ResponseEntity<Patients> getPatientById(@PathVariable("id") Long id) {
		return patientService.findPatientById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	//POST
	@PostMapping
	public Patients createPatient(@RequestBody Patients patient) {
		return patientService.savePatient(patient);
	}
	
	//PUT
	
	//DELETE
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletePatient(@PathVariable("id") Long id) {
		return patientService.findPatientById(id)
				.map(patient -> {
					patientService.deletePatient(id);
					return ResponseEntity.ok().<Void>build();
				})
				.orElse(ResponseEntity.notFound().build());
	}
	
	
}
