package com.nicosandoval.controlador.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.springframework.lang.NonNull;



@Entity
@Table(name="cliente")
public class Cliente {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	

	@NonNull
	@NotFound
	@Column(name="nombre")
	private String nombre;
	
	@NonNull
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="email")
	private String email;

	public Cliente() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String name) {
		this.nombre = name;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String surname) {
		this.apellido = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", name=" + nombre + ", surname=" + apellido + ", email=" + email + "]";
	}

	
	
}
