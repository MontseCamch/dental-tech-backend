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
	@Column(name="idappointment")
    private Long id_appointment;

    @Column
    private String date_time;
    @Column
    private String reason;

    @ManyToOne
    @JoinColumn(name = "idpatient", nullable = false)
    private Patients patient;

    @ManyToOne
    @JoinColumn(name = "idtreatment", nullable = false)
    private Treatments treatment;


    public Appointments() {}

	

	public Appointments(Long idappointment, String date_time, String reason, Patients patient, Treatments treatment) {
		super();
		this.id_appointment = idappointment;
		this.date_time = date_time;
		this.reason = reason;
		this.patient = patient;
		this.treatment = treatment;
	}

	
	

	

	public Long getIdappointment() {
		return id_appointment;
	}



	public void setIdappointment(Long idappointment) {
		this.id_appointment = idappointment;
	}



	public String getDate_time() {
		return date_time;
	}



	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}



	public String getReason() {
		return reason;
	}



	public void setReason(String reason) {
		this.reason = reason;
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



	@Override
	public String toString() {
		return "Appointments [idappointment=" + id_appointment + ", date_time=" + date_time + ", reason=" + reason
				+ ", patient=" + patient + ", treatment=" + treatment + "]";
	}



	
    
    
}
