package com.nicosandoval.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/tirar")
public class TirarController {
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() { // proporciona el formulario
		return "holaAlumnosFormulario";
	}
	
	@RequestMapping("/procesarFormulario2")
	//public String otroProcesoFormulario(HttpServletRequest request, Model model) {
	public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model model) {
		//String nombre = request.getParameter("nombreAlumno");
	
		nombre += " Es el peor alumno";
		String mensaje = "¿quien es el peor alumno? " + nombre;
		
		//agregando info al modelo
		
		model.addAttribute("mensaje", mensaje);
		
		
		return "holaAlumnosSpring";
	}

}
