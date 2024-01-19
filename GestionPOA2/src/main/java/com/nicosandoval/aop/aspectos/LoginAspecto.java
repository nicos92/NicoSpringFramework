package com.nicosandoval.aop.aspectos;



import org.aspectj.lang.JoinPoint;
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
	public void paraClientes() {}

	@Before("paraClientes() ")
	public void antesInsertarCliente(JoinPoint miJoin) {
		System.out.println("El usuario esta logueado");
		System.out.println("El perfil para insertar clientes es correcto");
		
		
		Object[] argumentos = miJoin.getArgs();
		
		for (Object object : argumentos) {
			if(object instanceof Cliente) {
				Cliente cl = (Cliente) object;
				System.out.println("Nombre del Cliente: " + cl.getNombre());
				System.out.println("Tipo del Cliente: " + cl.getTipo());
			}
		}

	}
	


}
