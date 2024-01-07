package com.nicosandoval.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	@InitBinder
	public void miBinder(WebDataBinder binder) {
		StringTrimmerEditor trimEdit = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, trimEdit);
		
	}
	
	@RequestMapping("/viewFormRegistroAlumno")
	public String formAlumno(Model model) {
		
		Alumno alumno = new Alumno();
		
		model.addAttribute("miAlumno", alumno);
		
		return "formRegistroAlumno";
		
	}
	
	@RequestMapping("/resultRegisterAlumn")
	public String procesoFormulario(@Valid @ModelAttribute("miAlumno") Alumno alumno, BindingResult resultadoValidacion) {
		
		if (resultadoValidacion.hasErrors()) {
			
			return "formRegistroAlumno";
			
		} else {
			return "resultRegisterAlumn";
		}
		
	}

}
