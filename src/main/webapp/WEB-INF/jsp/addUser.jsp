<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2> ADD NEW USER:</h2>
		<form:form method="POST" action="save" modelAttribute="user">
             <table>
             <tr>
                    <td><form:label path="user_id">User ID</form:label></td>
                    <td><form:input path="user_id"/></td>
                </tr>
                <tr>
                    <td><form:label path="user_name">User Name</form:label></td>
                    <td><form:input path="user_name"/></td>
                </tr>
                <tr>
                    <td><form:label path="user_pwd">Password</form:label></td>
                    <td><form:password path="user_pwd"/></td>
                </tr>
               
                <tr>
                    <td><input type="submit" value="Add User"/></td>
                </tr>
            </table>
        </form:form>
</body>
</html>