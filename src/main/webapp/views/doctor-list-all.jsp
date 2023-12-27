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
<div align="center">
	<h3>List Of Doctors</h3>
	<a href="userlogin">Add User Detail</a>
	<hr>
	<table border="1" >
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Dob</th>
			<th>Gender</th>
			<th>Mobile Number</th>
			<th>user Id</th>
			<th>password</th>
			<th>email</th>
			<th>category</th>
			
		</tr>
		<c:forEach items="${userlist}" var="DoctorDetails">
			<tr>
				<td>${DoctorDetails.idd }</td>
				<td>${DoctorDetails.first_name }</td>
				<td>${DoctorDetails.last_name }</td>
				<td>${DoctorDetails.dob}</td>
				<td>${DoctorDetails.gender }</td>
				<td>${DoctorDetails.contact_number }</td>
				<td>${DoctorDetails.id }</td>
				<td>${DoctorDetails.password}</td>
				<td>${DoctorDetails.email}</td>
				<td>${DoctorDetails.category}</td>
				
				
			</tr>
		</c:forEach>
	</table>
	<a href="/">Logout</a>
</div>
</body>
</html>