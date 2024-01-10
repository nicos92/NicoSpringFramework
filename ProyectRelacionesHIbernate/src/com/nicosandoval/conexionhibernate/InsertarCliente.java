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
				.addAnnotatedClass(Pedido.class)
				.buildSessionFactory();

		// crear la clase seccion

		Session miSession = miSessionFactory.openSession();

		try {
			
			String name = "Nico";

			// crear objeto para la BD
			String apellido = "Sandoval";
			String direccion = "uruguay 872";
			String tel = "012345689";
			Cliente cliente = new Cliente(name, apellido , direccion);
			
			String coment = "monotributista";
			DetallesCliente detalesCliente = new DetallesCliente(name + "@" + apellido, tel, coment );

			
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
