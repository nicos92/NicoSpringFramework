package com.nicosandoval.pruebasanotations;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {
	
	private CreacionInformeFinanciero informe;
	
	@Value("${email}")
	private String email;
	
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
	
	public String getEmail() {
		return email;
	}



	public String getNombreEmpresa() {
		return nombreEmpresa;
	}



	public DirectorFinanciero(CreacionInformeFinanciero informe) {
		this.informe = informe;
	}

	

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestion y direccion de las operaciones financieras de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informe.getInformeFinanciero();
	}

}
