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
	<table border="1">
	<tr>
			<th>clinic_id</th>
			<th>clinic_name</th>
			<th>Address</th>
			<th>Facilities Available</th>
			<th>Contact_number</th>
			<th>website</th>
			<th>locality/Pincode</th>
			<th>Specality</th>
			<th>Availability</th>
			<th>ID</th>
			<th>Appointment Booking</th>
		</tr>
	<c:forEach items="${list}" var="list">
	<tr>
       <td> ${list.clinic_id }</td>
       <td>${list.clinic_name }</td>
				<td>${list.address}</td>

				<td>${list.facilities_available }</td>
				<td>${list.contact_number }</td>
				<td>${list.website }</td>
				<td>${list.pincode }</td>
				<td>${list.speciality }</td>
				<td>${list.availability }</td>
				<td>${list.id}</td>
				<td>
				<button>
						<a href="/appointmentbooking">Book Your Appointment</a>
					</button>
					</td>
			</tr>
    </c:forEach>
    
</table>
<div align="center">
<a href="/">Logout</a>
</div>
</body>
</html>
	