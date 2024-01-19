package com.nicosandoval.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class ClienteDAO {

	public void insertaCliente() {
		System.out.println("Trabajo realizado ok. Cliente guardado con exito");
	}

}
