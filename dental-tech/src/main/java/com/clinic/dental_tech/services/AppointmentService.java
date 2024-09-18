package com.clinic.dental_tech.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.dental_tech.models.Appointments;
import com.clinic.dental_tech.repository.AppointmentsRepository;

@Service
public class AppointmentService {
	@Autowired
	private AppointmentsRepository appointmentsRepository;
	
	//GET
	public List<Appointments> findAllAppointments() {
		return appointmentsRepository.findAll();
	}
	
	//GET Single
	public Optional<Appointments> findAppointmentById(Long id){
		return appointmentsRepository.findById(id);
	}
	
	//POST
	public Appointments saveAppointment(Appointments appointment) {
		return appointmentsRepository.save(appointment);
	}
	
	//PUT
	
	//DELETE
	public void deleteAppointment(Long id) {
		appointmentsRepository.deleteById(id);
	}
	
}
