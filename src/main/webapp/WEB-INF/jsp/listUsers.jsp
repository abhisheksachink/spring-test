<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items = "${allUsers}" var="user">
		<p>${user.getUser_id()}</p>
		<p>${user.getUser_name()}</p>
		<p>${user.getUser_pwd()}</p>
	</c:forEach>
</body>
</html>