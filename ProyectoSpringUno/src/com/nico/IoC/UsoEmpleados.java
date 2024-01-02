package com.nico.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		//Creacion de onjetos d etipo Empleado
		
		//Empleados empleado1 = new DirectorEmpleado();
		//Uso de los Obetos creados
		
		//ystem.out.println(empleado1.getTareas());
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
	/*

		Empleados nico = contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(nico.getTareas());
		System.out.println(nico.getInforme());
		*/
		
		SecretarioEmpleado nico2 = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado facu = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println("\n" + nico2.getTareas());
		System.out.println(nico2.getInforme());
		System.out.println("Email: " + nico2.getEmail());
		System.out.println("Nombre de Empresa: " + nico2.getNombreEmpresa());
		
		System.out.println(facu.getTareas());
		System.out.println(facu.getInforme());
		System.out.println("Email: " + facu.getEmail());
		System.out.println("Nombre de Empresa: " + facu.getNombreEmpresa());
		
		DirectorEmpleado nacho = contexto.getBean("miEmpleado", DirectorEmpleado.class);

		System.out.println(nacho.getTareas());
		System.out.println(nacho.getInforme());
		System.out.println("Email: " + nacho.getEmail());
		System.out.println("Nombre de Empresa: " + nacho.getNombreEmpresa());
		System.out.println(nico2);
		System.out.println(facu);
		
		contexto.close();
	}

}
