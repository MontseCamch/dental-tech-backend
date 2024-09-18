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

import com.clinic.dental_tech.models.Appointments;
import com.clinic.dental_tech.services.AppointmentService;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentsController {

	@Autowired
	private AppointmentService appointmentService;
	
	//GET
	@GetMapping
	public List<Appointments> getAllAppointments() {
		return appointmentService.findAllAppointments();
	}
	
	//GET Single
	@GetMapping("/{id}")
	public ResponseEntity<Appointments> getAppointmentById(@PathVariable("id") Long id) {
		return appointmentService.findAppointmentById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	//POST
	@PostMapping
	public Appointments createAppointment(@RequestBody Appointments appointment) {
		return appointmentService.saveAppointment(appointment);
	}
	
	//PUT
	
	//DELETE
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteAppointment(@PathVariable("id") Long id) {
		return appointmentService.findAppointmentById(id)
				.map(appointment -> {
					appointmentService.deleteAppointment(id);
					return ResponseEntity.ok().<Void>build();
				})
				.orElse(ResponseEntity.notFound().build());
	}
	
	
	
}
