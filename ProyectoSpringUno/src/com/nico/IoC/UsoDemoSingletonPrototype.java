package com.nico.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// carga de xml de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		// peticion de beans al contenedor Spring
		
		SecretarioEmpleado maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado pedro = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado pedro2 = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado pedro3 = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado pedro4 = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		
		System.out.println(maria);
		System.out.println(pedro);
		System.out.println(pedro2);
		System.out.println(pedro3);
		System.out.println(pedro4);
		
		/*if(maria==pedro) System.out.println("apunta al mismo objeto en memoria");
		else System.out.println("no apuntan al mismo objeto en memoria");*/
		contexto.close();
	}

}
