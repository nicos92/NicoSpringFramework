package com.nicosandoval.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nicosandoval.aop.dao.ClienteDAO;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//leer la configuracion de spring
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		
		// obtener el bean del contenedor de spring
		
		ClienteDAO clienteDao = contexto.getBean("clienteDAO", ClienteDAO.class);
		
		System.out.println(clienteDao.getClientes());
		
		System.out.println("Aqui continuaria la ejecucion del programa");

		
		//cerrar el contexto
		
		contexto.close();

	}

}
