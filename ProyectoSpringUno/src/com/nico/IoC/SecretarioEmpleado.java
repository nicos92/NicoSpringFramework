package com.nico.IoC;

public class SecretarioEmpleado implements Empleados {
	
	// CREACION DE CAMPO TIPO CREACIONiNFORME (INTERFAZ)
	private CreacionInformes informeNuevo;
	
	private String email;
	private String nombreEmpresa;
	
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getTareas() {
		return "Gestionar la agenda de los jefes";
	}
	
	@Override
	public String getInforme() {
		return "Informe presentado por el Secretario con arreglos: " + informeNuevo.gerInforme();	
	}

}
