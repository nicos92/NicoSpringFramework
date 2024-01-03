package com.nicosandoval.pruebasanotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnnotation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instanciar la clase @Configuration
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);

		// pedir un bean a un contenedor
		
		Empleados empleado = contexto.getBean("directorFinanciero", Empleados.class);
		
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInforme());

		// cerrar el contexto

		contexto.close();
	}

}
