package com.nicosandoval.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspecto {

	@Before("execution(public void inserta*())")
	public void antesInsertarCliente() {
		System.out.println("El usuario esta logueado");
		System.out.println("El perfil para insertar clientes es correcto");
	}
}
