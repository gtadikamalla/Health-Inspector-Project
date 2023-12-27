<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<marquee behavior="alternate" bgcolor="green"><h1>Check your Status here!</h1></marquee>
<form action="/getAppointmentStatustDetails" action="get">

	ENTER  APPOINTMENT_ID TO CHECK APPOINTMENT STATUS :<input type="text" name="appointment_id">


		<input type="submit" name="Submit" value="Submit">



	</form>

</body>
</html>