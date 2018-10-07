package br.com.demoapp.loja.web.model;


import java.util.Date;

public class Product {
	
	private Long id;	
	private String name;
	private Double price;
	private Double cost;
	private Date validUntil;
	
	
	public Product() {}
	
	public Product(Long id, String name, Double price, Double cost, Date validUntil){
		this.setId(id);
		this.setName(name);
		this.setPrice(price);
		this.setCost(cost);
		this.setValidUntil(validUntil);		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Date getValidUntil() {
		return validUntil;
	}

	public void setValidUntil(Date validUntil) {
		this.validUntil = validUntil;
	}
}