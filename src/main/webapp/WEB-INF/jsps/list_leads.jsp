<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list of all leads...</title>
</head>
<body>
	<h2>list all lead...</h2>
	<table border='1'>
		<tr>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Mobile</th>
		</tr>
		
		<c:forEach var="leads" items= "${leads }" >
		<tr>
			<td>${leads.firstName }</td>
			<td>${leads.lastName }</td>
			<td>${leads.email }</td>
			<td>${leads.mobile }</td>
			
		</tr>
		</c:forEach>
	
	</table>
	
	
	
	
	
	
	</table>

</body>
</html>