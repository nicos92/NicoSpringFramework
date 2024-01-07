<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Alumn</title>
</head>
<body>

	<form:form action="resultRegisterAlumn" modelAttribute="miAlumno">

		<label>Nombre:</label>
		<form:input path="nombre" type="text" id="name" />
		<form:errors path="nombre" style="color:red" />

		<br />
		<br />

		<label>Apellido:</label>
		<form:input path="apellido" type="text" id="surname" />

		<br />
		<br />

		<label>Edad:</label>
		<form:input path="edad" type="text" id="edad" />
		<form:errors path="edad" style="color:red" />

		<br />
		<br />
		<label>Codigo Postal:</label>
		<form:input path="codPostal" type="text" id="codPostal" />
		<form:errors path="codPostal" style="color:red" />

		<br />
		<br />

		<label>Email:</label>
		<form:input path="email" type="text" id="email" />
		<form:errors path="email" style="color:red" />

		<br />
		<br />


		<form:select path="materia">

			<form:option value="Diseño" label="Diseño" />
			<form:option value="Karate" label="Karate" />
			<form:option value="Comercio" label="Comercio" />
			<form:option value="Danza" label="Danza" />
		</form:select>

		<br />
		<br />

		<label>San Vicente</label>
		<form:radiobutton path="ciudadEstudios" value="San Vicente" />

		<label>A. Korn</label>
		<form:radiobutton path="ciudadEstudios" value="A. Korn" />

		<label>Guernica</label>
		<form:radiobutton path="ciudadEstudios" value="Guernica" />

		<label>Glew</label>
		<form:radiobutton path="ciudadEstudios" value="Glew" />

		<br />
		<br />

		<label>Ingles</label>
		<form:checkbox path="idiomaEstudio" value="Ingles" />

		<label>Aleman</label>
		<form:checkbox path="idiomaEstudio" value="Aleman" />

		<label>Chino</label>
		<form:checkbox path="idiomaEstudio" value="Chino" />

		<br />
		<br />

		<input type="submit" value="cargar">


	</form:form>
</body>
</html>