package br.com.demoapp.apigateway.web.model;


import java.util.ArrayList;
import java.util.Date;

public class Order {
	
	private Long id;	
	private Status status;
	private Date createdAt;
	private Customer customer;
	private ArrayList<Product> products;
	private Date deliveryTime;
	
	public Order() {}
	
	public Order(Long id, Status status, Date createdAt, Customer customer, ArrayList<Product> products, Date deliveryTime){
		this.setId(id);
		this.setStatus(status);
		this.setCreatedAt(createdAt);
		this.setCustomer(customer);
		this.setProducts(products);
		this.setDeliveryTime(deliveryTime);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public Date getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
}