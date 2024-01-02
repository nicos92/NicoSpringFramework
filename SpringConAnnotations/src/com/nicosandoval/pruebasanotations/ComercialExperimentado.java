package com.nicosandoval.pruebasanotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados {
	
	@Autowired
	private CreacionInformeFinanciero informeFinanciero;
	
	

	
	/*public ComercialExperimentado(CreacionInformeFinanciero informeFinanciero) {
		
		this.informeFinanciero = informeFinanciero;
	}*/

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vernder mas!";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		//return "Informe generado por el comercial";
		return informeFinanciero.getInformeFinanciero();
	}

}
