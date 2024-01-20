package com.nicosandoval.aop.aspectos;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.nicosandoval.aop.Cliente;

@Aspect
@Component
@Order(2)
public class LoginAspecto {

	@Pointcut("execution(* com.nicosandoval.aop.dao.*.*(..))")
	public void paraClientes() {
	}

	@Before("paraClientes() ")
	public void antesInsertarCliente(JoinPoint miJoin) {
		System.out.println("El usuario esta logueado");
		System.out.println("El perfil para insertar clientes es correcto");

		Object[] argumentos = miJoin.getArgs();

		for (Object object : argumentos) {
			if (object instanceof Cliente) {
				Cliente cl = (Cliente) object;
				System.out.println("Nombre del Cliente: " + cl.getNombre());
				System.out.println("Tipo del Cliente: " + cl.getTipo());
			}
		}

	}

	@AfterReturning(pointcut = "execution(* com.nicosandoval.aop.dao.ClienteDAO.getClientes(..) )", returning = "listClientes")
	public void luegoGetClientes(List<Cliente> listClientes) {
		for (Cliente cliente : listClientes) {
			if (cliente.getTipo() == "VIP") {

				procesadoDatosAfterReturning(listClientes);
				System.out.println("hay clientes VIP en el listado");
				System.out.println("Cliente VIP: " + cliente.getNombre());
			}
		}
	}

	@AfterThrowing(pointcut = "execution(* com.nicosandoval.aop.dao.ClienteDAO.getClientes(..) )", throwing = "exepcionGetClientes")
	public void procesandoDatosAfterExceptionGetClientes(Throwable exepcionGetClientes) {
		System.out.println("Aqui se estarian ejecutando de forma automatica las tareas tras la exepcion + "
				+ "guardar en un log o lo que sea");

	}
	@After("execution(* com.nicosandoval.aop.dao.ClienteDAO.getClientes(..) )")
	public void ejecutandoTareasconYsinExcepcion(JoinPoint joinpoint) {
		System.out.println("ejecutando tareas SIEMPRE despues del metodo");
	}
	
	
	@Around("execution(* com.nicosandoval.aop.servicios.MedicionServicio.getServicio(..) )")
	public Object ejecutarServicio(ProceedingJoinPoint poit)throws Throwable{
		
		double comienzo = System.currentTimeMillis();
		System.out.println("---- Comienzo de acciones antees de llamada ---- ");
		Object result = poit.proceed(); // el point apunta al metodo destino
		double fin = System.currentTimeMillis();
		System.out.println(" ---- tareas despues de llamada ---- el metodo tardó : " + ( fin - comienzo)/1000 + " Segundos");
		
		
		return result;
	}

	private void procesadoDatosAfterReturning(List<Cliente> listClientes) {

		for (Cliente cliente : listClientes) {
			if (cliente.getTipo() == "VIP") {
				String datosPRocesados = "V.I.P. " + cliente.getNombre().toUpperCase();
				cliente.setNombre(datosPRocesados);
			}
		}
	}

}
