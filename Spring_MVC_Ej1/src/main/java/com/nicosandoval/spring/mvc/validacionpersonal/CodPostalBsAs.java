package com.nicosandoval.spring.mvc.validacionpersonal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=CPostalBsAsValidation.class) // futura clase que contendra la logica de la validacion
@Target({ElementType.METHOD, ElementType.FIELD}) // destino de nuestra validacion a metodos o campos
@Retention(RetentionPolicy.RUNTIME) // chequea la anotacion en tiempo de ejecucion
public @interface CodPostalBsAs {
	
	// definir el codigo postal por defecto
	
	public String value() default "18";
	
	//definir el mensaje de error 
	
	public String message() default "el CP debe comenzar con 18";
	// definir los grupos
	Class<?>[] groups() default {};
	// definir los payloads
	
	Class<? extends Payload>[] payload() default {};

}
