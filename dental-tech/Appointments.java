package com.clinic.dental_tech.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "appointments")
public class Appointments {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idappointment;

    @Column
    private String appointment_date;

    @Column
    private String appointment_time;

    @ManyToOne
    @JoinColumn(name = "idpatient", nullable = false)
    private Patients patient;

    @ManyToOne
    @JoinColumn(name = "idtreatment", nullable = false)
    private Treatments treatment;

    @ManyToOne
    @JoinColumn(name = "iddoctor", nullable = false)
    private Doctors doctor;

    public Appointments() {}

	public Appointments(Long idappointment, String appointment_date, String appointment_time, Patients patient,
			Treatments treatment, Doctors doctor) {
		super();
		this.idappointment = idappointment;
		this.appointment_date = appointment_date;
		this.appointment_time = appointment_time;
		this.patient = patient;
		this.treatment = treatment;
		this.doctor = doctor;
	}

	public Long getIdappointment() {
		return idappointment;
	}

	public void setIdappointment(Long idappointment) {
		this.idappointment = idappointment;
	}

	public String getAppointment_date() {
		return appointment_date;
	}

	public void setAppointment_date(String appointment_date) {
		this.appointment_date = appointment_date;
	}

	public String getAppointment_time() {
		return appointment_time;
	}

	public void setAppointment_time(String appointment_time) {
		this.appointment_time = appointment_time;
	}

	public Patients getPatient() {
		return patient;
	}

	public void setPatient(Patients patient) {
		this.patient = patient;
	}

	public Treatments getTreatment() {
		return treatment;
	}

	public void setTreatment(Treatments treatment) {
		this.treatment = treatment;
	}

	public Doctors getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctors doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Appointments [idappointment=" + idappointment + ", appointment_date=" + appointment_date
				+ ", appointment_time=" + appointment_time + ", patient=" + patient + ", treatment=" + treatment
				+ ", doctor=" + doctor + "]";
	}
    
    
}
