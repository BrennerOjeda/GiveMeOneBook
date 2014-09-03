<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Libros</title>

<link href="<c:url value="/resources/css/estilos.css" />" rel="stylesheet">

</head>
<body>
<h3>Welcome <core:out value="${loginForm.userName}" /></h3>
	 <jsp:include page="header.jsp" flush="true" />
        <div id="contenedor">    
			<section>
				<article>
					<hgroup>
						<h3>Búsqueda de libro</h3>
					</hgroup>
					<p>
						  <form:form action="paginaLibros.html"  commandName="librosForm">
						   <table>
								<tr>
									<td><label>Codigo libro</label></td><td><form:input path="codLibro" /></td>
									<td><label>Titulo</label></td><td><form:input path="titulo" /></td>
									<td><label>Autor</label></td><td><form:input path="autor" /></td>
									<td><input type="submit" name="buscarLibro" value="Submit"></td>
									
								</tr>
							</table>	
						    <div id="tabla-libro"></div>
						   </form:form>
					</p>   
				</article>    
			</section>
        </div>
		
		

		
	     <div id="contenedor">
	     <h3>Lista de libros</h3>
	    <div class="CSSTableGenerator" >
                <table >
                	 <tr>
                        <td>
                            Código
                        </td>
                        <td >
                            Título
                        </td>
                        <td>
                            Editor
                        </td>
                        <td>
                            Año
                        </td>
                         
                    </tr>
                	<c:forEach items="${model.listaRecursos}" var="libro">
                		<tr>
	                	  <td ><c:out value="${libro.ideRec}"/> </td> 
					      <td ><c:out value="${libro.titRec}"/> </td > 
					      <td ><c:out value="${libro.editRec}"/> </td >
					      <td ><c:out value="${libro.anioEdicRec}"/> </td >
					      
					    </tr>
				    </c:forEach>
                   
                </table>
            </div>
            </div>
            
</body>
</html>