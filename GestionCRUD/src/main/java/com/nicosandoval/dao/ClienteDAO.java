package com.nicosandoval.dao;

import java.util.List;

import com.nicosandoval.controlador.entity.Cliente;

public interface ClienteDAO {
	
	public List<Cliente> getClientes ();

	public void insertarCliente(Cliente cliente);


	public Cliente getCliente(int clinteId);

	public void eliminarCliente(int elCliente);

}
