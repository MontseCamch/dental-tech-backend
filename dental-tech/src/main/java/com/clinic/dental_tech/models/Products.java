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
@Table(name = "products")
public class Products {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idproduct")
	private Long id_product;

    @Column
    private String product_name;

    @Column
    private int stock;

    @Column
    private double price;

    @Column
    private String category;

    @ManyToOne
    @JoinColumn(name = "iduser", nullable = false)
    private Users user;

    @ManyToOne
    @JoinColumn(name = "idpatient", nullable = false)
    private Patients patient;

    public Products() {}

	public Products(Long idproduct, String product_name, int stock, double price, String category, Users user,
			Patients patient) {
		super();
		this.id_product = idproduct;
		this.product_name = product_name;
		this.stock = stock;
		this.price = price;
		this.category = category;
		this.user = user;
		this.patient = patient;
	}

	public Long getIdproduct() {
		return id_product;
	}

	public void setIdproduct(Long idproduct) {
		this.id_product = idproduct;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Patients getPatient() {
		return patient;
	}

	public void setPatient(Patients patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Products [idproduct=" + id_product + ", product_name=" + product_name + ", stock=" + stock + ", price="
				+ price + ", category=" + category + ", user=" + user + ", patient=" + patient + "]";
	}
    
    
}
