<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<link href="<c:url value="/resources/css/estilos.css" />" rel="stylesheet">
<script src="<c:url value="http://maps.google.com/maps/api/js?sensor=falses" />"></script>

</head>
<body>
	<h3>Welcome <core:out value="${loginForm.usuario.nomUsu}" /></h3>
	<jsp:include page="header.jsp" flush="true" />
	  
  	
</body>
</html>