package com.nicosandoval.pruebasanotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnnotation4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instanciar la clase @Configuration
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);

		// pedir un bean a un contenedor
		
		DirectorFinanciero empleado = contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInforme());
		System.out.println("Email: " + empleado.getEmail() + "\nNombre de Empresa: " + empleado.getNombreEmpresa());
		
		

		// cerrar el contexto

		contexto.close();
	}

}
