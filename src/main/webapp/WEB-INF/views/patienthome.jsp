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
			<h1>Welcome ${patient.first_name } ${patient.last_name }</h1>
			<h1>Your Registration Id is:  ${patient.id }  </h1>
		</marquee>
	</div>
	<div align="left">
		<form action="/AvailabilityDoctors" method="get" >
			
				Search Doctor by Locality <input type="text"  placeholder="Enter your pincode to search doctor" name="locality" required />
				 <input type="submit" value="Search" />
			
		</form>
		<form action="/SpecalityDoctors" method="get" >
			
				Search Doctor by Speciality <input type="text"  placeholder="Enter Specality to search doctor" name="speciality" required />
				 <input type="submit" value="Search" />
			
		</form>
		
		<button><a href="/searchstatus">Check Your Appointment Status</a></button> 
		||
		<button><a href="/reportForm">Help</a></button><br/>
		||
	
		<form action="/getRResolution" method="get" >
			
				Check Your Status: <input type="text"  placeholder="Enter Your Request Id" name="id" required />
				<input type="hidden" name="userid" value="${patient.id}" >
				 <input type="submit" value="View Resolution" />
			
		</form>
		
		
	</div>
	
		
	
	
	<div align="right">
		<a href="/">Logout ${patient.first_name } ${patient.last_name }</a>
	</div>

</body>
</html>