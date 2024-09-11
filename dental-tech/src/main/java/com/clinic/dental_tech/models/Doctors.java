package com.clinic.dental_tech.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctors")
public class Doctors {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iddoctor;

    @Column
    private String first_name;

    @Column
    private String last_name;

    @Column
    private String speciality;

    public Doctors() {}

	public Doctors(Long iddoctor, String first_name, String last_name, String speciality) {
		super();
		this.iddoctor = iddoctor;
		this.first_name = first_name;
		this.last_name = last_name;
		this.speciality = speciality;
	}

	public Long getIddoctor() {
		return iddoctor;
	}

	public void setIddoctor(Long iddoctor) {
		this.iddoctor = iddoctor;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	@Override
	public String toString() {
		return "Doctors [iddoctor=" + iddoctor + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", speciality=" + speciality + "]";
	}
    
    
}
