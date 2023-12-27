<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
		<marquee behavior="alternate" bgcolor="green"><h1>Welcome to Appointment Booking Form</h1></marquee>
		<form:form  action="/appointmentDetails" method="post" modelAttribute="username" >
	
   			 
			<form:label path="patient_name"  >Patient Name: </form:label>
			<form:input path="patient_name" pattern="^[A-Za-z]+$" title="it must contain only alphabets "/><br><br>
			 
		
				
			<form:label path="patient_locality">Patient Locality: 	</form:label>
			<form:input path="patient_locality"  title="please enter location"/><br><br>	
			  
			
			
			<form:label path="purpose_of_visit">Purpose of Visit: 	</form:label>
			<form:input path="purpose_of_visit" pattern="^[A-Za-z]+$" title="it must contain only alphabets"/><br><br>	
			  
			
			
				
			<form:label path="gender">Gender:</form:label>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        Male <form:radiobutton path="Gender" value="Male"/> &nbsp;&nbsp;&nbsp;
         
        Female <form:radiobutton path="Gender" value="Female"/> <br> <br>			
			 
			
			<form:label path="age">Age:	</form:label>
			<form:input path="age" pattern="^[0-9]+$" title="It must contain 1 or 2 digits"/><br><br>	
			 
			
			
			
			<form:label path="contact_number">Mobile Number:</form:label>
			<form:input path="contact_number" pattern="[6-9]{1}[0-9]{9}" title="It must contain 10 digits and start with 6 to 9 anyone digit"/><br><br>	 
			
			
					
			<form:label path="clinic_id">Clinic Id: </form:label>            
  			<form:input  path="clinic_id" pattern="^[0-9]+$" title="it contains only numbers"/><br><br>
  			
			
  			<input type="submit" class="btn success">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<button> <a href="/">back</a> </button>
		</form:form>
		</div>




</body>
</html>