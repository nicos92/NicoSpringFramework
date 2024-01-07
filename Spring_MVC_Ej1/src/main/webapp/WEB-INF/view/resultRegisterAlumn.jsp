<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<p>El Alumno <strong>${miAlumno.nombre}</strong> <strong>${miAlumno.apellido}</strong> de edad <strong>${miAlumno.edad }</strong> 
	, email: <strong>${miAlumno.email }</strong> y Codigo postal <strong>${miAlumno.codPostal }</strong> se registro
		correctamente</p>
	<p>en la materia <strong>${miAlumno.materia}</strong></p>
	<p>en la ciudad de <strong>${miAlumno.ciudadEstudios}</strong></p>
	<p>idiomas a estudiar: <strong>${miAlumno.idiomaEstudio}</strong></p>

</body>
</html>