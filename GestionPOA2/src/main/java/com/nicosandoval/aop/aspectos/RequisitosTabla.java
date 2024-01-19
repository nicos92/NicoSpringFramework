package com.nicosandoval.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class RequisitosTabla {

	
	@Before("com.nicosandoval.aop.aspectos.LoginAspecto.paraClientes()")
	public void requisitosTabla() {
		System.out.println("hay menos de 3000 registos en la tabla. puedes insertar el nuevo cliente");
	}
}
