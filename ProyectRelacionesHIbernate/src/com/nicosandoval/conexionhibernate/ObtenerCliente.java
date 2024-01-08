package com.nicosandoval.conexionhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ObtenerCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory miSessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Cliente.class).addAnnotatedClass(DetallesCliente.class).buildSessionFactory();

		// crear la clase session

		Session miSession = miSessionFactory.openSession();

		try {

			// ejecutar transaccion
			miSession.beginTransaction();

			// obtener detalles cliente

			DetallesCliente detallesCliente = miSession.get(DetallesCliente.class, 2);

			if (detallesCliente != null) {
				System.out.println(detallesCliente);
				System.out.println(detallesCliente.getCliente());

				miSession.getTransaction().commit();
				
			} else {
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
