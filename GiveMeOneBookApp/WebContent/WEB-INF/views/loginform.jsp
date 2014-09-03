<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		 <title>GivemeABook</title>
		 <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
		 <script src="<c:url value="/resources/js/control_logeo.js" />"></script>
				
</head>
<body>
 <section class="container">
    <div class="login">
		<h1>Login de Gestion de bliblioteca</h1>
		
		<form:form action="loginform.html"  commandName="loginForm">
			<table>
				<tr>
					<td>User Name:<FONT color="red"><form:errors
						path="userName" /></FONT></td>
				</tr>
				<tr>
					<td><form:input path="userName" /></td>
				</tr>
				<tr>
					<td>Password:<FONT color="red"><form:errors
						path="password" /></FONT></td>
				</tr>
				<tr>
					<td><form:password path="password" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form:form>
  </section>
</body>
</html>