<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
<div align="center">
	<table border="1">
		<tr>
			<th>Request Id</th>
			<th>Issue</th>
			<th>Description</th>
			<th>Resolution</th>
			
		</tr>
		<c:forEach items="${list}" var="list1"> 
		<tr>



			<td>${list1.id}</td>
			<td>${list1.issue}</td>
			<td>${list1.description}</td>
			<td>${list1.model.resolution }</td>


		</tr>
		  </c:forEach>

	</table>

	<a href="/">Logout</a>

</div>
</body>
</html>