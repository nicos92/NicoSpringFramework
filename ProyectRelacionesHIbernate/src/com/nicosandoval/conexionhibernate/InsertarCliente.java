package com.nicosandoval.conexionhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertarCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crear un objeto de tipo session factory

		SessionFactory miSessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Cliente.class)
				.addAnnotatedClass(DetallesCliente.class)
				.buildSessionFactory();

		// crear la clase seccion

		Session miSession = miSessionFactory.openSession();

		try {

			// crear objeto para la BD
			Cliente cliente = new Cliente("Anto", "Pastorenzi", "uruguay 872");
			
			DetallesCliente detalesCliente = new DetallesCliente("Anto@Pastorenzi", "02224464770", "monotributista");

			
			// asociar los objetos
			
			cliente.setDetallesCliente(detalesCliente);
			
			
			// ejecutar transaccion
			miSession.beginTransaction();

			miSession.save(cliente);

			miSession.getTransaction().commit();

			System.out.println("registro insertado");


			miSession.close();

			//
		} finally {
			// TODO: handle finally clause
			miSessionFactory.close();
		}
	}

}
