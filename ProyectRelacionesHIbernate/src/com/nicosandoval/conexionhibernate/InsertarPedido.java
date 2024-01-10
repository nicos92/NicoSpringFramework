package com.nicosandoval.conexionhibernate;

import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertarPedido {

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
			// ejecutar transaccion
			miSession.beginTransaction();

// obtener el cliente de la tabla Cliente de la base de datos
			Cliente cliente = miSession.get(Cliente.class, 5);
			
			if(cliente==null) {
				System.out.println("No se encontro el cliente");
			}else {
				// crear pedido del cliente
				
				Pedido pedido1 = new Pedido(new GregorianCalendar(2024,5,1));
				Pedido pedido2 = new Pedido(new GregorianCalendar(2024,6,2));
				Pedido pedido3 = new Pedido(new GregorianCalendar(2024,7,3));
				Pedido pedido4 = new Pedido(new GregorianCalendar(2024,8,4));
				
				// agregar pedidos al cliente
				
				cliente.insertPedido(pedido1);
				cliente.insertPedido(pedido2);
				cliente.insertPedido(pedido3);
				cliente.insertPedido(pedido4);
				
				// guardar los pedidos en la base de dato s de la tabla pedido
				
				miSession.save(pedido1);
				miSession.save(pedido2);
				miSession.save(pedido3);
				miSession.save(pedido4);
				
				miSession.getTransaction().commit();
				System.out.println("registro insertado");
			}
			
		
		} catch(Exception e){
			e.printStackTrace();
		}finally {
			// TODO: handle finally clause
			miSession.close();
			miSessionFactory.close();
		}
	}

}
