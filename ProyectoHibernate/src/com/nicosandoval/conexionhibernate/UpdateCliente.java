package com.nicosandoval.conexionhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// crear un objeto de tipo session factory

		SessionFactory miSessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Cliente.class).buildSessionFactory();

		// crear la clase seccion

		Session miSession = miSessionFactory.openSession();

		try {

			//int clienteId = 4;

			// ejecutar transaccion
			miSession.beginTransaction();
			
			//Cliente cliente = miSession.get(Cliente.class, clienteId);
			
			//cliente.setApellido("Sandoval");
			
			miSession.createQuery("update Cliente set apellido='Pastor' where apellido LIKE '%Pastoren%'").executeUpdate();
			
			

			miSession.getTransaction().commit();

			System.out.println("registro actualizado");

			// temrinar

			System.out.println("terminado");
			miSession.close();

			//
		} finally {
			// TODO: handle finally clause
			miSessionFactory.close();
		}

	}

}
