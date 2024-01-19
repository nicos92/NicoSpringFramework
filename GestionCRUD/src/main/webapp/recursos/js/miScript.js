document.addEventListener('DOMContentLoaded', () => {





	if (location.href.indexOf("cliente/formularioAgregar") != -1) {

		document.getElementById("name").value = "";
		document.getElementById("apellido").value = "";
		document.getElementById("email").value = "";


		document.getElementById("name").focus();
		document.getElementById("tituloForm").innerHTML = 'Guardar <small class="text-body-secondary">Cliente</small>';
		console.log(document.getElementById("tituloForm").value);


	} else {

		document.getElementById("tituloForm").innerHTML = 'Modificar <small class="text-body-secondary">Cliente</small>';
		document.getElementById("btnGuardar").innerHTML = '<i class="bi bi-person-exclamation"></i> Modificar';

	}






})