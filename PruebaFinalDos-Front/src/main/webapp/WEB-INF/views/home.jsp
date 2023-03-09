<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prueba Final BikeShop</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<div class="container">
	
		<h1 class="py-3 px-1">BikeShop Catálogo</h1>
		<br>
		<div>
			<form:form action="/listar" method="POST" modelAttribute="BusquedaDTO">
				<div class="form-group row col-12">
				
				 <div class="form-group row col-3 mr-1">
			      	 <p class="text-muted"> Tiendas  </p>
			      	 <br>
			     	 <select name="storeId" class="form-control">
			     	 	<c:forEach items="${stores}" var="s">
			     	 		<option class="col-6" value="${s.storeName}"><c:out value="${s.storeName}"></c:out></option>
			     	 	</c:forEach>
					 </select>
				  </div>
		
		
				 <div class="form-group row col-3 mr-1">
			      	 <p class="text-muted"> Categorias  </p>
			      	 <br>
			     	 <select name="categoryId" class="form-control">
			     	 	<c:forEach items="${products}" var="c">
			     	 		<option class="col-6" value="${c.categoryId}"><c:out value="${c.categoryId}"></c:out></option>
			     	 	</c:forEach>
					 </select>
				  </div>
				  
				   <div class="form-group row col-3 mr-1">
			      	 <p class="text-muted"> Marca  </p>
			      	 <br>
			     	 <select name="brandId" class="form-control">
			     	 	<c:forEach items="${brand}" var="b">
			     	 		<option class="col-6" value="${b.brandId}"><c:out value="${b.brandId}"></c:out></option>
			     	 	</c:forEach>
					 </select>
				  </div>

				</div>			
			  <div class="form-group row px-3">
				 <div >
					 <button type="submit" class="btn btn-primary">Buscar</button>
				 </div>
			  </div>
		   </form:form>
		</div>
		<br>

	</div>



</body>
</html>