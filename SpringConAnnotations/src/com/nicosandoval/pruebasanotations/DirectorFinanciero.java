package com.nicosandoval.pruebasanotations;



public class DirectorFinanciero implements Empleados {
	
	private CreacionInformeFinanciero informe;
	
	
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
