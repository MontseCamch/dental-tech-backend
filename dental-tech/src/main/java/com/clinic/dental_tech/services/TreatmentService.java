package com.clinic.dental_tech.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.dental_tech.models.Treatments;
import com.clinic.dental_tech.repository.TreatmentsRepository;

@Service
public class TreatmentService {
	@Autowired
	private TreatmentsRepository treatmentsRepository;
	
	//GET
	public List<Treatments> findAllTreatments() {
		return treatmentsRepository.findAll();
	}
	
	//GET Single
	public Optional<Treatments> findTreatmentById(Long id) {
		return treatmentsRepository.findById(id);
	}
	
	//POST
	public Treatments saveTreatment(Treatments treatment) {
		return treatmentsRepository.save(treatment);
	}
	
	//PUT
	
	//DELETE
	public void deleteTreatment(Long id) {
		treatmentsRepository.deleteById(id);
	}
	
}
