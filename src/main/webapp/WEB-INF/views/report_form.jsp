<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Report Your Issue</title>
</head>
<body>
	<div align="center">
		<marquee behavior="alternate" bgcolor="green">
			<h1>Welcome ${user.first_name } ${user.last_name}</h1>
			<h1>Your Registration id is: ${user.id}</h1>
		</marquee>
		<marquee behavior="alternate" bgcolor="green">
			<h1>Report Your Issue</h1>
		</marquee>

		<form:form action="/postissue" method="post" modelAttribute="issue">
			<table>
				<tr>
					<td><form:label path="issue">Issue:</form:label></td>
					<td><form:input path="issue" /><br /></td>
				</tr>
				<tr>
					<td><form:label path="description">Description:</form:label></td>
					<td><form:textarea path="description" cols="25" rows="5" /><br /></td>
                   <form:hidden path="userid" value="${user.id}" />             
				</tr>
				<tr>
					<td><form:button>Send</form:button></td>
				</tr>
			</table>


		</form:form>
		<a href="/">Logout</a>
	</div>
</body>
</html>