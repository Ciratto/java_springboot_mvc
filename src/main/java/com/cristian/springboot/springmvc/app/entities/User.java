package com.cristian.springboot.springmvc.app.entities;

import java.time.LocalDateTime;

public class User {
	private Long id;
	private String name;
	private String lastName;
	private String email;
	private String username;
	private LocalDateTime altaFecha;
	
	public User() {
	}
	
	public User(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
		this.altaFecha = LocalDateTime.now();
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public LocalDateTime getAltaFecha() {
		return altaFecha;
	}
	public void setAltaFecha(LocalDateTime altaFecha) {
		this.altaFecha = altaFecha;
	}
}
