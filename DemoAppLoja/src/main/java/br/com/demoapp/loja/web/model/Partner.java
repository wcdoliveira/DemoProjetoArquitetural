package br.com.demoapp.loja.web.model;

public class Partner {
	
	private Long id;	
	private String name;
	
	public Partner() {}
	
	public Partner(Long id, String name){
		this.setId(id);
		this.setName(name);
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
}