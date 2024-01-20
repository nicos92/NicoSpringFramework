package com.nicosandoval.aop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nicosandoval.aop.Cliente;

@Component
public class ClienteDAO {

	public void insertaCliente(Cliente cliente, String tipo) {
		System.out.println("Trabajo realizado ok. Cliente guardado con exito: " + cliente);

	}

	public List<Cliente> getClientes(boolean miParam) {

		if (miParam) {
			throw new RuntimeException("Error: No se ha podido procesar la peticion");
		}

		List<Cliente> clientes = new ArrayList<>();
		// simular clientes devueltos por base de dastos

		Cliente cl1 = new Cliente("Anto", "Normal");
		Cliente cl2 = new Cliente("Nico", "Normal");
		Cliente cl3 = new Cliente("Mama", "Normal");
		Cliente cl4 = new Cliente("Caro", "VIP");

		// agregar clientes a la lista

		clientes.add(cl1);
		clientes.add(cl2);
		clientes.add(cl3);
		clientes.add(cl4);

		System.out.println("ejecucion finalizada del metodo getClientes: ");
		return clientes;
	}

	public ClienteDAO() {

	}

}
