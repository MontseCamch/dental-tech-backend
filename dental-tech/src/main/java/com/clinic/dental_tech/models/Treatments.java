package com.clinic.dental_tech.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "treatments")
public class Treatments {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idtreatment")
    private Long id_treatment;

    @Column
    private String treatment_name;

    @Column
    private double price;

    @OneToOne
    @JoinColumn(name = "iddoctor", nullable = false)
    private Doctors doctor;

    public Treatments() {}


	public Treatments(Long id_treatment, String treatment_name, double price, Doctors doctor) {
		super();
		this.id_treatment = id_treatment;
		this.treatment_name = treatment_name;
		this.price = price;
		this.doctor = doctor;
	}
	

	public Long getId_treatment() {
		return id_treatment;
	}


	public void setId_treatment(Long id_treatment) {
		this.id_treatment = id_treatment;
	}


	public String getTreatment_name() {
		return treatment_name;
	}


	public void setTreatment_name(String treatment_name) {
		this.treatment_name = treatment_name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Doctors getDoctor() {
		return doctor;
	}


	public void setDoctor(Doctors doctor) {
		this.doctor = doctor;
	}


	@Override
	public String toString() {
		return "Treatments [id_treatment=" + id_treatment + ", treatment_name=" + treatment_name + ", price=" + price
				+ ", doctor=" + doctor + "]";
	}


	
    
    
}
