package com.nicosandoval.aop.dao;

import org.springframework.stereotype.Component;

import com.nicosandoval.aop.Cliente;

@Component
public class ClienteDAO {

	public void insertaCliente(Cliente cliente, String tipo) {
		System.out.println("Trabajo realizado ok. Cliente guardado con exito: " + cliente );
		
	}
	
	private String caloracionClienteNormal;
	
	private String codigoClientenormal;

	public ClienteDAO(String caloracionClienteNormal, String codigoClientenormal) {
		
		this.caloracionClienteNormal = caloracionClienteNormal;
		this.codigoClientenormal = codigoClientenormal;
	}

	public ClienteDAO() {
	
	}

	public String getCaloracionClienteNormal() {
		System.out.println("obteninendo valoracion del cliente normal");
		return caloracionClienteNormal;
	}

	public void setCaloracionClienteNormal(String caloracionClienteNormal) {

		System.out.println("estableciendo valoracion del cliente normal");
		this.caloracionClienteNormal = caloracionClienteNormal;
	}

	public String getCodigoClientenormal() {

		System.out.println("obteninendo codigo del cliente normal");
		return codigoClientenormal;
	}

	public void setCodigoClientenormal(String codigoClientenormal) {

		System.out.println("estableciendo codigo del cliente normal");
		this.codigoClientenormal = codigoClientenormal;
	}

}
