package com.nicosandoval.pruebasanotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// leer el xml de configuratiuon
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// pedir un bean a un contenedor
		
		Empleados anto = contexto.getBean("comercialExperimentado", Empleados.class);
		
		//usar el bean
		
		System.out.println("Informe: " + anto.getInforme());
		System.out.println("Tareas: " + anto.getTareas());
		
		//cerrar el contexto
		
		contexto.close();

	}

}
