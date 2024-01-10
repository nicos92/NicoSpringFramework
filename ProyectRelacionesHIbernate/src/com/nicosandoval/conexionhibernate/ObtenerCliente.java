package com.nicosandoval.conexionhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ObtenerCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory miFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Cliente.class)
				.addAnnotatedClass(DetallesCliente.class)
				.addAnnotatedClass(Pedido.class)
				.buildSessionFactory();

		// crear la clase session

		Session miSession = miFactory.openSession();

		try {
			
			//FETCH EAGER devuelve toda la informacion de golpe
			//FETCH LAZY devuelve la informacion cuando la necesita
			

			// ejecutar transaccion
			miSession.beginTransaction();

			// obtener detalles cliente

			//DetallesCliente detallesCliente = miSession.get(DetallesCliente.class, 2);
			
			//Cliente cliente = miSession.get(Cliente.class, 5);
			Query<Cliente> consulta = miSession.createQuery("SELECT CL FROM Cliente CL "
					+ "JOIN FETCH CL.pedidos WHERE CL.id =:clienteId", Cliente.class);
			

			consulta.setParameter("clienteId", 5);
			
			Cliente cliente = consulta.getSingleResult();
			if (cliente != null) {
				System.out.println("CLIENTE: " + cliente);
			

				
				miSession.getTransaction().commit();
				
			} else {
				System.out.println("No se encontro el cliente");
			}
			
			miSession.close();
			System.out.println(cliente.getPedidos());
			System.out.println(cliente.getPedidos().size());

			
		} catch(Exception e){
			e.printStackTrace();
		}finally {
			// TODO: handle finally clause
			//miSession.close();
			miFactory.close();
		}
	}

}
