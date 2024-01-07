<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/estilos/estilo.css">
<title>Insert title here</title>
</head>
<body>

	<div class="contenedor">

		<h1 class="centered">Hola ${param.nombreAlumno}. Bienvenido al Curso de Spring.</h1>

		<h2 class="centered">
			<br> Atencion a todos
		</h2>
		<h3 class="centered"> ${mensaje}</h3>

		<div class="target">
			<div class="cuadroImg">
				<img id="mifoto" alt="foto"
					src="${pageContext.request.contextPath}/recursos/imgs/artico.jpg">
			</div>
		</div>

	</div>




</body>
</html>