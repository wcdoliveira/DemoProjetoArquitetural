package br.com.demoapp.apigateway.web.model;


import java.util.ArrayList;

public class Customer {
	
	private Long id;	
	private String fullName;
	private ArrayList<Order> orders;
	
	public Customer() {}
	
	public Customer(Long id, String fullName, ArrayList<Order> orders){
		this.setId(id);
		this.setFullName(fullName);
		this.setOrders(orders);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}
}