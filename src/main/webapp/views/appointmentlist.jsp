<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
</head>
<body>


	<form method="post">
		<table>
			<tr>
				<th>Appointment Id</th>
				<th>patient Name</th>
				<th>patient Locality</th>
				<th>patient_problem</th>
				<th>clinic Id</th>
				<th>gender</th>
				<th>age</th>
				<th>contact number</th>
				<th>choose</th>
				<th>choose</th>

			</tr>
			<c:forEach items="${listappointment}" var="appointmentdetails" >

				<tr>
					<td>${appointmentdetails.appointmentId}</td>
					<td>${appointmentdetails.patient_name}</td>
					<td>${appointmentdetails.patient_locality}</td>
					<td>${appointmentdetails.purpose_of_visit}</td>
					<td>${appointmentdetails.clinic_id }</td>
					<td>${appointmentdetails.gender }</td>
					<td>${appointmentdetails.age }</td>
					<td>${appointmentdetails.contact_number }</td>
					<td><a type="button" class="btn btn-warning" href="/acceptstatus?appointment_id=${appointmentdetails.appointmentId}">ACCEPT</a>
					<td><a type="button" class="btn btn-warning" href="/rejectstatus?appointment_id=${appointmentdetails.appointmentId}">REJECT</a>
				</tr>

			</c:forEach>
		</table>



	</form>

<div><a href="/">Logout</a></div>
</body>
</html>
