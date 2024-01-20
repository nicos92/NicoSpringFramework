package com.nicosandoval.aop.servicios;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;


@Component
public class MedicionServicio {
	
	public String getServicio() {
		System.out.println("**** EL METODO REALIZANDO SUS TAREAS ****");
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Servicios terminados";
	}

}
