package com.clinic.dental_tech.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.dental_tech.models.Patients;
import com.clinic.dental_tech.repository.PatientsRepository;

@Service
public class PatientService {
	@Autowired
	private PatientsRepository patientsRepository;
	
	//GET
	public List<Patients> findAllPatients() {
		return patientsRepository.findAll();
	}
	
	//GET Single
	public Optional<Patients> findPatientById(Long id){
		return patientsRepository.findById(id);
	}
	
	//POST
	public Patients savePatient(Patients patient) {
		return patientsRepository.save(patient);
	}
	
	//PUT
	
	//DELETE
	public void deletePatient(Long id) {
		patientsRepository.deleteById(id);
	}
	
	
}
