package com.nicosandoval.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nicosandoval.aop.dao.ClienteDAO;
import com.nicosandoval.aop.dao.ClienteVipDAO;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//leer la configuracion de spring
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		
		// obtener el bean del contenedor de spring
		
		ClienteDAO cliente = contexto.getBean("clienteDAO", ClienteDAO.class);
		ClienteVipDAO clienteVip = contexto.getBean("clienteVipDAO", ClienteVipDAO.class);
		
		//llamar al metodo
		
		cliente.insertaCliente(); // este es el nombre del  metodo que debe coioncidir con la anotacion @Before
		clienteVip.insertaClienteVip(); // este es el nombre del  metodo que debe coioncidir con la anotacion @Before
		
		//cerrar el contexto
		
		contexto.close();

	}

}
