package com.nicosandoval.pruebasanotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ComercialExperimentado implements Empleados {
	
	
	// metodo que se ejecuta cuando se inicia el BEAN
	@PostConstruct
	public void postInitBean() {
		System.out.println("me ejecuto automaticamente despues que se crea el Bean si mi clase es de @scope(singleton)");
	}
	
	// metodo que se ejecuta antes de que se destrulla el BEAN
	@PreDestroy
	public void preDestroyBean() {
		System.out.println("me ejecuto automaticamente antesde de que se destruya el Bean si mi clase es de @scope(singleton)");
	}
	
	
	@Autowired
	@Qualifier("informeFinancieroTrim4")   // id de bean que va a utilizar
	private CreacionInformeFinanciero informeFinanciero;
	

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
