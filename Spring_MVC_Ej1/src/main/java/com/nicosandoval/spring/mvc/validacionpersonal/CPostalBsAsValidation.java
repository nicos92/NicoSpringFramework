package com.nicosandoval.spring.mvc.validacionpersonal;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CPostalBsAsValidation implements ConstraintValidator<CodPostalBsAs, String>{
	
	private String prefijoCPBsas;

	@Override
	public void initialize(CodPostalBsAs codPostalBsAs) {
		prefijoCPBsas = codPostalBsAs.value();
		
	}
	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		boolean valCod;
		
		if(arg0!=null)valCod=arg0.startsWith(prefijoCPBsas);
		else return true;
		
		return valCod;
	}
	
	

}
