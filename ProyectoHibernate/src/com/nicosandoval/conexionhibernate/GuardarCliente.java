package com.nicosandoval.conexionhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GuardarCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// crear un objeto de tipo session factory

		SessionFactory miSessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Cliente.class).buildSessionFactory();

		// crear la clase seccion

		Session miSession = miSessionFactory.openSession();

		try {

			// crear objeto para la BD
			Cliente cliente = new Cliente("Diana", "Rodriguez", "España 44");

			// ejecutar transaccion
			miSession.beginTransaction();

			miSession.save(cliente);

			miSession.getTransaction().commit();

			System.out.println("registro insertado");

			// lectura de registro

			miSession.beginTransaction();
			System.out.println("lectura del registro con id: " + cliente.getId());
			Cliente clienteInsertado = miSession.get(Cliente.class, cliente.getId());
			System.out.println("registro: " + clienteInsertado);
			miSession.getTransaction().commit();
			System.out.println("terminado");
			miSession.close();

			//
		} finally {
			// TODO: handle finally clause
			miSessionFactory.close();
		}

	}

}
