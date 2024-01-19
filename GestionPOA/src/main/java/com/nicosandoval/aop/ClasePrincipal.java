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
		
		Cliente cliente = new Cliente();
		
		ClienteDAO clienteDao = contexto.getBean("clienteDAO", ClienteDAO.class);
		ClienteVipDAO clienteVip = contexto.getBean("clienteVipDAO", ClienteVipDAO.class);
		
		//llamar al metodo
		
		clienteDao.insertaCliente(cliente, "nomal"); // este es el nombre del  metodo que debe coioncidir con la anotacion @Before
		
		clienteDao.setCodigoClientenormal("0123456789");
		clienteDao.setCaloracionClienteNormal("positiva");
		String codigoClienteNormal = clienteDao.getCodigoClientenormal();
		String valoracionClienteNormal = clienteDao.getCaloracionClienteNormal();
		
		System.out.println(codigoClienteNormal + " - " + valoracionClienteNormal);
		clienteVip.insertaClienteVip(); // este es el nombre del  metodo que debe coioncidir con la anotacion @Before
		
		//cerrar el contexto
		
		contexto.close();

	}

}
