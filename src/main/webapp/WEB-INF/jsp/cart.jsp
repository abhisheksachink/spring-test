<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Product List:</h1>
	
	
	<table border="1">
		<tr>
			<th>Prod_ID</th>
			<th>Prod_Name</th>
			<th>Prod_Desc</th>
			<th>Price</th>
			<th>Action</th>
			<c:forEach items="${cartsss}" var="cart">
				<tr>
					<td>${cart.getProdName()}</td>
					<td>${cart.getProdDesc()}</td>
					<td>${cart.getPrice()}</td>
					
					</tr>

			</c:forEach>

	</table>

</body>
</html>