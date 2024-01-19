package com.nicosandoval.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspecto {
	
	@Pointcut("execution(public * insertaCliente(..))")
	private void paraClientes() {}
	

	@Before("paraClientes() ")
	public void antesInsertarCliente() {
		System.out.println("El usuario esta logueado");
		System.out.println("El perfil para insertar clientes es correcto");
		

	}
	
	@Before("paraClientes() ")
	public void requisitosCliente() {
		System.out.println("El cliente cumple los requisitos para ser insertado en la BBDD");
	}
	
	@Before("paraClientes()")
	public void requisitosTabla() {
		System.out.println("hay menos de 3000 registos en la tabla. puedes insertar el nuevo cliente");
	}
}
