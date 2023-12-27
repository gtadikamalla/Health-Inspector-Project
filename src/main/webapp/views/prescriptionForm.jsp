<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
		<h2>Prescription Page</h2>
		<form:form action="/postPrescriptionDetails" method="post" modelAttribute="PrescriptionDetails">		
	
			<form:label path="symptoms">symptoms: </form:label>
			<form:input path="symptoms" required="true"/><br>
					
			<form:label path="diagnosis">diagnosis:</form:label>
			<form:input path="diagnosis" required="true"/><br>
			
			<form:label path="treatment_planned">treatment_planned :</form:label>
			<form:input path="treatment_planned" required="true"/><br>
			
			<form:label path="prescription">prescription:</form:label>
			<form:input path="prescription"/><br>
			
			<form:label path="revisit_required">revisit_required:</form:label>
			<form:input path="revisit_required"/><br>	
			
			<form:label path="next_revisit_date">next_revisit_date: </form:label>
			<form:input path="next_revisit_date" /><br>				
					
			<form:label path="frequency_revisit">frequency_revisit: </form:label>            
  			<form:input  path="frequency_revisit"/><br>
  			
  			<form:label path="pappointmentid">Patient Appointment Id:</form:label>            
  			<form:input  path="pappointmentid"/><br>
  			
			<input type="submit" value="submit" /><br>
			<a href="/">Go Back</a>
		
		</form:form>
		</div>

</body>
</html>