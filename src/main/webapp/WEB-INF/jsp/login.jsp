<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${message}</h1><br>
	<form action = "processLogin" method = "post">
			User Name: <input type = "text" name = "uname" placeholder = "Enter user name"><br><br>
			Password: <input type = "password" name = "pwd" placeholder = "Enter password"><br><br>
			<input type = "submit" value = "login"/>
	</form>
    <a href="processCart">Display Cart</a>
</body>
</html>