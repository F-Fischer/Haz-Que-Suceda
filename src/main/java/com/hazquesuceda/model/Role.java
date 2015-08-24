package com.hazquesuceda.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "rol")
public class Role implements Serializable{

	private static final long serialVersionUID = 6503849464807212587L;

	private Long id;
	private String role;
	
	@Id
	@GeneratedValue
	@Column(name="ID_rol")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "nombre")
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
