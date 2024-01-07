package com.nicosandoval.spring.mvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.nicosandoval.spring.mvc.validacionpersonal.CodPostalBsAs;

public class Alumno {

	@NotNull
	@Size(min=2, message="campo invalido" )
	private String nombre;
	private String apellido;
	
	
	@Min(value=18, message="edad minima 18 años")
	@Max(value=110, message="edad maxima 110 años")
	private int edad;

	@NotNull
	@Email(message="Email invalido")
	private String email;

	private String materia;
	private String ciudadEstudios;
	private String idiomaEstudio;
	
	@Pattern(regexp="[0-9]{5}", message="codigo postal invalido, solo 5 numeros")
	@CodPostalBsAs
	private String codPostal;
	
	public String getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIdiomaEstudio() {
		return idiomaEstudio;
	}
	public void setIdiomaEstudio(String idiomaEstudio) {
		this.idiomaEstudio = idiomaEstudio;
	}
	public String getCiudadEstudios() {
		return ciudadEstudios;
	}
	public void setCiudadEstudios(String ciudadEstudios) {
		this.ciudadEstudios = ciudadEstudios;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}
