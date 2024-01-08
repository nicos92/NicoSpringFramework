package com.nicosandoval.conexionhibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConsultaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crear un objeto de tipo session factory

		SessionFactory miSessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Cliente.class).buildSessionFactory();

		// crear la clase seccion

		Session miSession = miSessionFactory.openSession();

		try {

			// ejecutar transaccion
			miSession.beginTransaction();
			
			// consulta a todos los clientes
			
			List<Cliente> clientes = miSession.createQuery("from Cliente", Cliente.class).getResultList();
			
			
		// mostrar los clientes
			
			mostrarListaCliente(clientes);
			
			// consulta a todoslos clientes con busqueda por apellido
			
			clientes = miSession.createQuery("from Cliente cl where cl.apellido = 'pastorenzi' ", Cliente.class).getResultList();
			mostrarListaCliente(clientes);
			
			// muestra todos los que viven en cierta direccion
			
			clientes = miSession.createQuery("from Cliente cl where cl.direccion = 'excelsior' ", Cliente.class).getResultList();
			mostrarListaCliente(clientes);
			
			//commit
			miSession.getTransaction().commit();
			
			// cerrar session
			miSession.close();
			

		} finally {
			// TODO: handle finally clause
			miSessionFactory.close();
		}
	}

	private static void mostrarListaCliente(List<Cliente> clientes) {
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}

}
