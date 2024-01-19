package com.nicosandoval.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nicosandoval.controlador.entity.Cliente;
import com.nicosandoval.dao.ClienteDAO;

@Controller
@RequestMapping("/cliente")
public class Controlador {

	@Autowired
	private ClienteDAO clienteDAO;

	@RequestMapping("/lista")
	public String listaClientes(Model model) {

		// obtener los clientes desde el DAO

		List<Cliente> clientes = clienteDAO.getClientes();

		// agregar los clientes al modelo

		model.addAttribute("clientes", clientes);

		return "tabla-clientes";
	}

	@RequestMapping("/formularioAgregar")
	public String formularioCliente(Model model) {

		Cliente cliente = new Cliente();
		model.addAttribute("cliente", cliente);
		return "formularioAgregar";
	}

	@PostMapping("/insertarCliente")
	public String insertarCliente(@ModelAttribute("cliente") Cliente elCliente) {

		// insertar Cliente en base de datos

		clienteDAO.insertarCliente(elCliente);

		return "redirect:/cliente/formularioAgregar";

	}

	@GetMapping("/formActualizarCliente")
	public String formActualizarCliente(@RequestParam("clienteID") int clinteId, Model model) {

		// obtener el cliente
		Cliente cliente = clienteDAO.getCliente(clinteId);

		// establecer el cliente como atributo del modelo
		model.addAttribute("cliente", cliente);

		// enviar al formulario

		return "formularioAgregar";

	}

	@GetMapping("/eliminarCliente")
	public String eliminarCliente(@RequestParam("clienteID") int elCliente) {

		// insertar Cliente en base de datos
		System.out.println("Id del cliente: " + elCliente);

		clienteDAO.eliminarCliente(elCliente);

		return "redirect:/cliente/lista";

	}

}
