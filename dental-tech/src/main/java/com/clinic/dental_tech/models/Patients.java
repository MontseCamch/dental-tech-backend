package com.clinic.dental_tech.models;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
public class Patients {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idpatient")
	private Long id_patient;
    
    @Column
    private String address;
    
    @Column
    private String phone;

    @OneToOne
    @JoinColumn(name = "iduser", nullable = false)
    private Users user;

    public Patients() {}

	public Patients(Long idpatient, String address, String phone, Users user) {
		super();
		this.id_patient = idpatient;
		this.address = address;
		this.phone = phone;
		this.user = user;
	}

	public Long getIdpatient() {
		return id_patient;
	}

	public void setIdpatient(Long idpatient) {
		this.id_patient = idpatient;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Patients [idpatient=" + id_patient + ", address=" + address + ", phone=" + phone + ", user=" + user
				+ "]";
	}
    
    
}
