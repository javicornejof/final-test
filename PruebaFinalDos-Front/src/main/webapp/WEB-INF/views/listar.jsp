<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BikeShop</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<div class="container">
	
		<h1 class="py-3 px-1">Listado de inventario</h1>
		<br>
	

		<div class="container">		
			<c:if test = "${empty inventario}"> 	
				<h1>No hay datos disponibles, intente otra búsqueda </h1>			
			</c:if>
			
			<table class="table">
				<thead class="thead-light">
					<tr>
						<th scope="col">Tienda</th>
						<th scope="col">ID Producto</th>
						<th scope="col">Nombre Producto</th>
						<th scope="col">Inventario</th>	
						<th scope="col">Acción</th>				
					</tr>
				</thead>
				<tbody>
					<c:forEach var="cat" items="${stores}">
					
					<tr>
						<td>${cat.storeName}</td>	
						<td>${cat.productId}</td>
						<td>${cat.productName}</td>
						<td>${cat.quantity}</td>	
					</tr>
					</c:forEach>
				</tbody>
			</table>
		
		</div>
	</div>


</body>
</html>