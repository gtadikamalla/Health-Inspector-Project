<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<marquee behavior="alternate" bgcolor="green">
			<h1>Welcome Dr.${user.first_name } ${user.last_name}</h1>
			 <h1>Your Registration id is: ${user.id} </h1>
		</marquee>
	</div>
	<div align="center">
	
		<button><a href="/addClinicDetails">Add Clinic Details</a> </button>
		
		<button><a href="/prescription">Prescription Form</a></button>
		
		<button><a href="/getAllPrescriptionDetails">Prescription</a></button>
		<button><a href="/reportForm">Help</a></button>
		</div>
		
		<form action="/appointments" method="get" >
			
				View Appointments: <input type="text"  placeholder="Enter your clinic id to view appointments" name="clinic_id" required />
				 <input type="submit" value="View Appointments" />
			
		</form>
		||
		||
		<form action="/getRResolution" method="get" >
			
				Check Your Status: <input type="text"  placeholder="Enter Your Request Id" name="id" required />
				<input type="hidden" name="userid" value="${user.id}" >
				 <input type="submit" value="View Resolution" />
			
		</form>
		
		
		<div align="right">
		<a href="/">Logout:   Dr.${user.first_name } ${user.last_name }</a>

	</div>
	

</body>
</html> 