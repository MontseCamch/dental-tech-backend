package com.clinic.dental_tech.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idorder;

    @Column
    private String order_date;

    @Column
    private double total;

    @Column
    private String order_status;

    @Column
    private int quantity;

    @Column
    private double unit_price;

    public Orders() {}

	public Orders(Long idorder, String order_date, double total, String order_status, int quantity, double unit_price) {
		super();
		this.idorder = idorder;
		this.order_date = order_date;
		this.total = total;
		this.order_status = order_status;
		this.quantity = quantity;
		this.unit_price = unit_price;
	}

	public Long getIdorder() {
		return idorder;
	}

	public void setIdorder(Long idorder) {
		this.idorder = idorder;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}

	@Override
	public String toString() {
		return "Orders [idorder=" + idorder + ", order_date=" + order_date + ", total=" + total + ", order_status="
				+ order_status + ", quantity=" + quantity + ", unit_price=" + unit_price + "]";
	}
    
    
    
}
