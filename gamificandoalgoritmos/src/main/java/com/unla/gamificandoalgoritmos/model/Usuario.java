package com.unla.gamificandoalgoritmos.model;

import java.util.Date;

public abstract class Usuario {
	private Integer idUser;
	private String username;
	private String password;
	private String name;
	private String lastName;
	private String email;
	private Date date;
	
	
	public Usuario(String username, String password, String name, String lastName, String email, Date date) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.date = date;
	}


	public Usuario(Integer idUser, String username, String password, String name, String lastName, String email,
			Date date) {
		super();
		this.idUser = idUser;
		this.username = username;
		this.password = password;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.date = date;
	}


	public Integer getIdUser() {
		return idUser;
	}


	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


}
