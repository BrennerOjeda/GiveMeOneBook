<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

 <link href="<c:url value="/resources/css/estilos.css" />" rel="stylesheet">
</head>
<body>
		<jsp:include page="header.jsp" flush="true" />
    <div id="contenedor">      
		<section>
				<article>
					<hgroup>
						<h3>Reovación de libro</h3>
					</hgroup>
					<p>
						<form method="GET" action="Controlador">
							<table>
								<tr>
									<td><label>Codigo libro</label></td><td><input type="text" name="codigoLibro" value=""></td>
									<td><label>Titulo</label></td><td><input type="text" name="titulo" value=""></td>
									<td><input type="submit" name="buscarLibrp" value="Buscar"></td>
								</tr>
								 <div id="formulario-renovar"></div>
							</table>							
						</form>
					</p>   
				</article>    
			</section>
		</div>
</body>
</html>