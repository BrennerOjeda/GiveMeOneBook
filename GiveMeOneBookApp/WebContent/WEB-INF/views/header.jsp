<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<header>
            <h1>Give me a Book!</h1>
            <h3>Maestría en informática 2014 - UNSA</h3>
    </header>
   <nav>
            <ul>
                <li><a href="#">Inicio</a></li>
				<li><a href="#">Actividad</a>
					<ul>
						<li><a href="paginaPrestamoLibro.html">Prestar</a></li>
						<li><a href="paginaRenovacionLibro.html">Renovar</a></li>
						<li><a href="paginaDevolucionLibro.html">Pedir</a></li>
                    </ul>
				</li>
                <li><a href="#">Libros</a>
                    <ul>
                    	<li><a href="paginaLibros.html">Todos Libros</a></li>
                    </ul>
                </li>
                <li><a href="#">Usuarios</a>
					<ul>
						<li><a href="paginaUsuarios.html">Todos los Usuarios</a></li>                      
                    </ul>
				</li>
                <!-- <li><a href="#">Circulación</a></li>  -->
                <li><a href="#">Ayuda</a>
              	  <ul>
                        <li><a href="paginaChat.html">Chat en linea</a></li>
                        <li><a href="paginaUbicacionMapa.html">Nuestra ubicacion</a></li>
                    </ul>
                </li>
                 
                 <li><a href="#">Salir</a>
					<ul>
						<li><a href="loginform.html">loguout</a></li>
                    </ul>
				</li>
            </ul>
        </nav>
        
</body>
</html>