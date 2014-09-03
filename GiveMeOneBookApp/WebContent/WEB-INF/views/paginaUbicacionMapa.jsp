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

	
	<h1  align="center">Geolocalización</h1>  
  	
  
	<script>  
	function success(position) {  
	 var status = document.querySelector('#status');  
	 status.innerHTML = "¡Le encontramos!";  
	  
	 var mapcanvas = document.createElement('div');  
	 mapcanvas.id = 'mapcanvas';  
	 mapcanvas.style.height = '400px';  
	 mapcanvas.style.width = '560px';  
	  
	 document.querySelector('#map').appendChild(mapcanvas);  
	  
	 var latlng = new google.maps.LatLng(position.coords.latitude, position.coords.longitude);
	 var latCatedra = new google.maps.LatLng(-16.41892, -71.542228);
	 var myOptions = {  
	 zoom: 17,  
	 center: latlng,  
	 mapTypeControl: false,  
	 navigationControlOptions: {style: google.maps.NavigationControlStyle.SMALL},  
	 mapTypeId: google.maps.MapTypeId.ROADMAP  
	 };  

	 var myOptionsCatedra = {  
			 zoom: 17,  
			 center: latCatedra,  
			 mapTypeControl: false,  
			 navigationControlOptions: {style: google.maps.NavigationControlStyle.SMALL},  
			 mapTypeId: google.maps.MapTypeId.ROADMAP  
			 };  	
	 
	 var map = new google.maps.Map(document.getElementById("mapcanvas"), myOptions); 

	 var mapCatedra = new google.maps.Map(document.getElementById("mapcanvas"), myOptions); ; 
	  
	 var marker = new google.maps.Marker({  
	 position: latlng,  
	 map: map,  
	 title:"aquí."  
	 });

	 var markerCatedra = new google.maps.Marker({  
		 position: latCatedra,  
		 map: mapCatedra,  
		 title:"Catedra Concytec."  
		 });
	 
	 var showVar = '<c:out value="${loginForm.usuario.nomUsu}"/>';
	 console.log(showVar);
	 var infowindow = new google.maps.InfoWindow({
		    content: 'Hola ' +showVar+', ¡esta es tu Ubicacion!'
		});  

	 google.maps.event.addListener(marker, 'click', function() {
		    infowindow.open(map,marker);
		  });

	 google.maps.event.addListener(markerCatedra, 'click', function() {
		    infowindow.open(mapCatedra,markerCatedra);
		  });

	}  
	  
	function error(msg) {  
	 var status = document.getElementById('status');  
	 status.innerHTML= "Error [" + error.code + "]: " + error.message;   
	}  
	  
	if (navigator.geolocation) {  
	 navigator.geolocation.getCurrentPosition(success, error,{maximumAge:60000, timeout: 4000});  
	} else {  
	 error('Su navegador no tiene soporte para su geolocalización');  
	}  
	  
	</script>  
	  
	<p id="status">Buscando su localización...</p>  
	<div align="center" id="map"></div> 
</body>
</html>