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

<table border="1">
		<tr>
			<th>Symptoms</th>
			<th>Diagnosis</th>
			<th>Treatment planned</th>
			<th>Prescription</th>
			<th>Revisit Required</th>
			<th>Next Revisit Date</th>
			<th>Frequency Revisit</th>
			<th>Patient Appointment Id</th>
			
		</tr>
		<c:forEach items="${prescriptionlist}"  var="PrescriptionDetails" >
			<tr>
				<td>${PrescriptionDetails.symptoms }</td>
				<td>${PrescriptionDetails.diagnosis }</td>
				<td>${PrescriptionDetails.treatment_planned }</td>
				<td>${PrescriptionDetails.prescription }</td>
				<td>${PrescriptionDetails.revisit_required }</td>
				<td>${PrescriptionDetails.next_revisit_date }</td>
				<td>${PrescriptionDetails.frequency_revisit }</td>	
				<td>${PrescriptionDetails.pappointmentid}</td>	
				
				

			</tr>
		</c:forEach>
	</table>
	<a href="/">Logout </a>
</div>
		
		
	

</body>
</html>