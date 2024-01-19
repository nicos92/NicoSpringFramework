package com.nicosandoval.aop.dao;

import org.springframework.stereotype.Component;

import com.nicosandoval.aop.Cliente;

@Component
public class ClienteDAO {

	public void insertaCliente(Cliente cliente, String tipo) {
		System.out.println("Trabajo realizado ok. Cliente guardado con exito: " + cliente );
		
	}

}
