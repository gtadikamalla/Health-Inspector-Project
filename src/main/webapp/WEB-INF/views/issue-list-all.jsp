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
<marquee behavior="alternate" bgcolor="green"><h1>List of Technical Issues</h1></marquee>
<table border="1" >
		<tr>
			<th>ID</th>
			<th>Issue</th>
			<th>Description about Issue</th>
			<th>Registration Id</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${issuelist}" var="issues">
			<tr>
				<td>${issues.id }</td>
				<td>${issues.issue}</td>
				<td>${issues.description }</td>
				<td>${issues.userid}</td>
				<td><button>
						<a href="/postResolution/${issues.id}">Give Resolution</a>
					</button></td>
			</tr>
		</c:forEach>
		</table>
		<div align="center">
		<a href="/">Logout</a>
		</div>

</body>
</html>