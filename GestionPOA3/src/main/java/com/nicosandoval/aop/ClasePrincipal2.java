package com.nicosandoval.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nicosandoval.aop.servicios.MedicionServicio;

public class ClasePrincipal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// leer la configuracion de spring

		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(
				Configuracion.class);

		// obtener el bean del contenedor de spring

		MedicionServicio servicio = contexto.getBean("medicionServicio", MedicionServicio.class);
		
		System.out.println("llamando al metodo getServicio()");
		
		String datos = servicio.getServicio();
		
		System.out.println("Devolucion de metodo: " + datos);

		System.out.println("Aqui continuaria la ejecucion del programa");

		// cerrar el contexto

		contexto.close();

	}

}
