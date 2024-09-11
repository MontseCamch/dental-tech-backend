package com.clinic.dental_tech.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "treatments")
public class Treatments {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idtreatment;

    @Column
    private String treatment_name;

    @Column
    private double cost;

    @ManyToOne
    @JoinColumn(name = "iddoctor", nullable = false)
    private Doctors doctor;

    public Treatments() {}

	public Treatments(Long idtreatment, String treatment_name, double cost, Doctors doctor) {
		super();
		this.idtreatment = idtreatment;
		this.treatment_name = treatment_name;
		this.cost = cost;
		this.doctor = doctor;
	}

	public Long getIdtreatment() {
		return idtreatment;
	}

	public void setIdtreatment(Long idtreatment) {
		this.idtreatment = idtreatment;
	}

	public String getTreatment_name() {
		return treatment_name;
	}

	public void setTreatment_name(String treatment_name) {
		this.treatment_name = treatment_name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Doctors getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctors doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Treatments [idtreatment=" + idtreatment + ", treatment_name=" + treatment_name + ", cost=" + cost
				+ ", doctor=" + doctor + "]";
	}
    
    
}
