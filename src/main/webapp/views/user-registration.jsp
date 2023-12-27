<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script type="text/javascript">
function regValidate()                                    
{ 
    var first_name = document.forms["useRegForm"]["first_name"];               
    var last_name = document.forms["useRegForm"]["last_name"];    
    var contact_number=document.forms["useRegForm"]["contact_number"]
    var dob = document.forms["useRegForm"]["dob"];  
    var gender =  document.forms["useRegForm"]["gender"];  
    var user_name =  document.forms["useRegForm"]["user_name"];  
    var password = document.forms["useRegForm"]["password"]; 
    var email = document.forms["useRegForm"]["email"];  
    var category = document.forms["useRegForm"]["category"];  
   
    if (first_name.value == "")                                  
    { 
        window.alert("Please enter first name."); 
        first_name.focus(); 
        return false; 
    } 
    if (last_name.value == "")                                  
    { 
        window.alert("Please enter last name."); 
        last_name.focus(); 
        return false; 
    } 
    if(contact_number.value.length != 10)
    	{
    	 window.alert("Please enter 10 digit mobile number."); 
    	 contact_number.focus(); 
         return false; 
    	}
    if (dob.value == "")                                  
    { 
        window.alert("Please enter your date of birth."); 
        dob.focus(); 
        return false; 
    } 
    var x=document.useRegForm.email.value; 
    var atposition=x.indexOf("@");  
    var dotposition=x.lastIndexOf(".");  
    if (atposition<1 || dotposition<atposition+2 || dotposition+2>=x.length){  
    	  alert("Please enter a valid e-mail address \n atpostion:"+atposition+"\n dotposition:"+dotposition);  
    	  email.focus(); 
    	  return false;  
    	  }  
   
    if (user_name.value == "")                        
    { 
        window.alert("Please enter your username"); 
        user_name.focus(); 
        return false; 
    } 
   
    if (password.value == "")                        
    { 
        window.alert("Please enter your password"); 
        password.focus(); 
        return false; 
    } 
   
    if (gender.value == " ")                  
    { 
    	 window.alert("Please enter your gender"); 
    	 gender.focus(); 
        return false; 
    } 
    if (category.value == " ")                  
    { 
    	 window.alert("Please enter your category"); 
    	 category.focus(); 
        return false; 
    } 
   
}




</script>
<style type="text/css">
input:focus {
  background-color: rgb(204, 255, 255);
}
body{
 
	 background-repeat:no-repeat;
	 background-size:100% 150%;
}
.table{
	padding:20px;
}


.success {background-color: #4CAF50;} /* Green */
.success:hover {background-color: #46a049;}
.warning {background-color: #ff9800;} /* Orange */
.warning:hover {background: #e68a00;}
.btn {
  border: 2px solid black;
  background-color: white;
  color: black;
  padding: 5px 20px;
	font-size: 16px;
	cursor: pointer;
}
.box {
	background-color: RGB(243, 233, 232);
	border: 2px  black;
	padding: 30px 20px;
	margin-left: 60%;
	margin-right: 10%;
	margin-top: 5%;
	border-radius: 50px 20px;
}



</style> 
<!-- <script type="text/javascript" src="/resources/js/userreg.js"></script> -->
<!-- <link rel="stylesheet" href="/resources/css/userreg.css"> -->
<title>User Registration</title>

</head>

<body>
	<div>

	</div>

	
	<div align="center">
		<marquee behavior="alternate" bgcolor="green"><h1>Welcome to Registration page</h1></marquee>
		<form:form name="useRegForm" action="/addUserDetail1" method="post" modelAttribute="username" onsubmit="return regValidate()">
		<div class="box">
			<div class="input-container">
   			 <i class="fa fa-user icon"></i>
			<form:label path="first_name"  >First Name: </form:label>
			<form:input path="first_name" pattern="^[A-Za-z]+$" title="it must contain only alphabets " /><br><br>
			<form:errors path="first_name" cssClass="error"/><br><br>  
			</div>		
			<form:label path="last_name">Last Name: 	</form:label>
			<form:input path="last_name" pattern="^[A-Za-z]+$" title="it must contain only alphabets " /><br><br>	
			<form:errors path="last_name" cssClass="error"/><br><br>  
			
			<form:label path="dob">DATE OF BIRTH: </form:label>
			<form:input type="date" path="dob" /><br><br>
			
				
			<form:label path="gender">Gender:</form:label>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        Male <form:radiobutton path="Gender" value="Male"/> &nbsp;&nbsp;&nbsp;
         
        Female <form:radiobutton path="Gender" value="Female"/> <br> <br>			
			<form:errors path="Gender" cssClass="error"/><br><br>  
			
			
			<form:label path="contact_number">Mobile Number: 	</form:label>
			<form:input path="contact_number"  pattern="[6-9]{1}[0-9]{9}" title="it must contain 10 digits start with 6 to 9 anyone digit " /><br><br>	
			<form:errors path="contact_number" cssClass="error"/><br><br>  
			
			
					
			<form:label path="id">User_id: </form:label>            
  			<form:input  path="id" pattern="^[0-9]+$" title="It must contain only digits"/><br><br>
  			<form:errors path="id" cssClass="error"/><br><br>  
			
  			
  			 <div class="input-container">
   			 <i class="fa fa-key icon"></i>
			<form:label path="password">Password: </form:label>
			<form:password  path="password" /><br><br>
			<form:errors path="password" cssClass="error"/><br><br>  
			
			</div>

			<div class="input-container">
   			 <i class="fa fa-envelope icon"></i>
  			<form:label path="email">E-mail: </form:label>
			<form:input type="email" path="email" pattern="\w+(\.-)?(\w+(\.-)?)*@[a-zA-Z]+\.[a-zA-Z]{2,3}" title="Format Ex: xyz@gmail.com" /><br><br>
			<form:errors path="email" cssClass="error"/><br><br>  
			
			</div>
				
			<form:label path="category">Category:</form:label>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        Doctor <form:radiobutton path="category" value="doctor"/>  &nbsp;&nbsp;&nbsp;
        Patient <form:radiobutton path="category" value="patient"/> <br><br>
			<form:errors path="category" cssClass="error"/><br><br>  
			
  			
			
			<input type="submit" class="btn success">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<button class="btn warning"><a href="/">back</a></button>
			</div>
		</form:form>
		</div>
	
</body>
</html>
