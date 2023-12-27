<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<marquee behavior="alternate" bgcolor="green">
			<h1>Resolution</h1>
		</marquee>

		<form:form action="/postresolution" method="post"
			modelAttribute="user">
			<table>
				<tr>
					<td><form:label path="id"  >Id:</form:label></td>
					<td><form:input path="id" value="${id}" /><br /></td>
				</tr>
				<tr>
					<td><form:label path="resolution">Resolution:</form:label></td>
					<td><form:textarea path="resolution" cols="25" rows="5" /><br /></td>

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