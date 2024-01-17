package com.nicosandoval.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nicosandoval.controlador.entity.Cliente;

@Repository
public class ClienteDAOclass implements ClienteDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Cliente> getClientes() {
		// TODO Auto-generated method stub

		// obtener la session
		Session session = sessionFactory.getCurrentSession();

		// crear la consulta
		Query<Cliente> consulta = session.createQuery("from Cliente", Cliente.class);

		// ejecutar la cunsulta y devolver resultado
		List<Cliente> clientes = consulta.getResultList();

		return clientes;
	}

	@Override
	@Transactional
	public void insertarCliente(Cliente cliente) {
		// TODO Auto-generated method stub

		// obtener la session
		Session session = sessionFactory.getCurrentSession();

		// guardar el cliente

		//session.save(cliente);
		session.saveOrUpdate(cliente);

	}
	
	@Override
	@Transactional
	public Cliente getCliente(int clienteId) {
		// TODO Auto-generated method stub

		// obtener la session
		Session session = sessionFactory.getCurrentSession();

		// obtener el cliente

		return session.get(Cliente.class, clienteId);

	}

	@Override
	@Transactional
	public void eliminarCliente(int elCliente) {
		// TODO Auto-generated method stub
		
		// obtener la session
		Session session = sessionFactory.getCurrentSession();

	

		//session.save(cliente);
		session.remove(session.get(Cliente.class, elCliente));
		
		
		
	}





}
