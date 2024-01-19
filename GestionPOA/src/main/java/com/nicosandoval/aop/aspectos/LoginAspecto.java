package com.nicosandoval.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspecto {
	
	/*
	 @Pointcut("execution(public * insertaCliente(..))")
	private void paraClientes() {}
	*/
	
	 @Pointcut("execution(* com.nicosandoval.aop.dao.*.*(..))")
	private void paraClientes() {}
	 
	 
	 
	 // pointcut para getters
	 @Pointcut("execution(* com.nicosandoval.aop.dao.*.get*(..))")
	 private void paraGetters() {}
	 
	 
	 // pointcut para setters
	 @Pointcut("execution(* com.nicosandoval.aop.dao.*.set*(..))")
	 private void paraSetters() {}
	 
	 //combinacion de pointcuts
	 @Pointcut("paraClientes() && !(paraGetters() || paraSetters())")
	 private void todoMenosGetySet() {}
	

	//@Before("paraClientes() ")
	 @Before("todoMenosGetySet()")
	public void antesInsertarCliente() {
		System.out.println("El usuario esta logueado");
		System.out.println("El perfil para insertar clientes es correcto");
		

	}
	
	//@Before("paraClientes() ")
	public void requisitosCliente() {
		System.out.println("El cliente cumple los requisitos para ser insertado en la BBDD");
	}
	
	//@Before("paraClientes()")
	public void requisitosTabla() {
		System.out.println("hay menos de 3000 registos en la tabla. puedes insertar el nuevo cliente");
	}
}
