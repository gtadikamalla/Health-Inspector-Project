<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">

<title>Add Clinic Details</title>
</head>
<body>
<div align="center">
		<marquee behavior="alternate" bgcolor="green"><h1>ADD CLINIC</h1></marquee>
		<form:form name="clinic" action="/PostClinicDetails" method="post" modelAttribute="clinicdetails" onsubmit="return Cvalidation()">
		
		<form:label path="clinic_id">Clinic Id</form:label>
		<form:input path="clinic_id" pattern="^[A-Za-z]+$"/><br>
		<form:label path="clinic_name">Clinic Name</form:label>
		<form:input path="clinic_name" pattern="^[A-Za-z]+$"/><br>
		<form:label path="address">Address</form:label>
		<form:input path="address" pattern="^[A-Za-z]+$"/><br>
		<form:label path="facilities_available">Facilities Available</form:label>
		<form:input path="facilities_available" /><br>
		<form:label path="contact_number">Contact Number</form:label>
		<form:input path="contact_number" pattern="[6-9]{1}[0-9]{9}"/><br>
		<form:label path="website">Website</form:label>
		<form:input path="website"  pattern="https?://.+"/><br>
		<form:label path="pincode">Locality/Pincode</form:label>
		<form:input path="pincode" /><br>	
		<form:label path="speciality">Speciality:</form:label>
        <form:select path="speciality" items="${professionList}" />		<br>
        
        <form:label path="availability">Availability</form:label>
		<form:input path="availability"/><br>
		
		<input type="submit" value="submit" /><br>
		<a href="/">Back</a>	
		</form:form>



</body>
</html>