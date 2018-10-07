package br.com.demoapp.loja.web.model;

public class User {
	
	private Long id;	
	private String login;
	private String fullName;
	
	public User() {}
	
	public User(Long id, String login, String fullName){
		this.setId(id);
		this.setLogin(login);
		this.setFullName(fullName);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}