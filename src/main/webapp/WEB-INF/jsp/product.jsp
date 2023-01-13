<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Welcome ${name}!</h1>
<h1> Welcome ${userId}!</h1>
<h3 style="color:red">${cartMsg}!</h3>

	<h1>Product List:</h1>
	
	
	<table border="1">
		<tr>
			<th>Prod_ID</th>
			<th>Prod_Name</th>
			<th>Prod_Desc</th>
			<th>Price</th>
			<th>Action</th>
			<c:forEach items="${allProducts}" var="product">
				<tr>
					<td>${product.getProdId()}</td>
					<td>${product.getProdName()}</td>
					<td>${product.getProdDesc()}</td>
					<td>${product.getPrice()}</td>
					<td><a href = "addtocart/${product.getProdId()}/${product.getProdName()}/${product.getProdDesc()}/${product.getPrice()}/${userId}">Add to Cart</a> </td>
					</tr>

			</c:forEach>

	</table>

	<h3 style="color:red">${delMsg}</h3>
	<h3 style="color:red">${updatemsg}</h3>
	<h3 style="color:red">${msg}</h3>

</body>
</html>