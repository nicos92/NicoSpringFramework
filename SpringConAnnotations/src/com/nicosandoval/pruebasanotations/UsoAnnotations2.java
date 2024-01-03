package com.nicosandoval.pruebasanotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// leer el xml de configuratiuon
		// ClassPathXmlApplicationContext contexto = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		// ó
		// instanciar la clase @Configuration
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		// pedir un bean a un contenedor

		Empleados anto = contexto.getBean("comercialExperimentado", Empleados.class);
		Empleados nahara = contexto.getBean("comercialExperimentado", Empleados.class);

		// usar el bean
		//
		if (anto == nahara) {
			System.out.println("Apuntan al mismo lugar en memoria \n" + anto + "\n" + nahara);
		} else {
			System.out.println("NO apuntan al mismo lugar en memoria \n" + anto + "\n" + nahara);
		}

		// cerrar el contexto

		contexto.close();
	}

}
