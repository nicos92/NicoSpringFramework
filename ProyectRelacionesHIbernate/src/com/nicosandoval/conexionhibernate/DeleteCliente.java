package com.nicosandoval.conexionhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteCliente {

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
			
			// ejecutar transaccion
			miSession.beginTransaction();
			
			Cliente cliente = miSession.get(Cliente.class, 4);
			
			if (cliente != null) {
				
				miSession.delete(cliente);
				miSession.getTransaction().commit();

				System.out.println("Registro Eliminado");
			}else {
				System.out.println("No se encontro el cliente");
			}
			

			miSession.close();

			//
		} finally {
			// TODO: handle finally clause
			miSessionFactory.close();
		}
	}

}
