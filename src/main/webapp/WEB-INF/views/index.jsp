<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Health Inspector</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
	background-image: url('C:\Users\prem\Desktop\demo\src\images\bg_2.jpg');
	background-repeat: no-repeat;
	background-size: cover;
	height: 100%;
}

.links {
	text-align:center;
	padding: 15px;
	margin:10px;
	line-height: 2.6;
	
}
div div a{
	font-size:20px;
	color:#9900cc;
	font-family: Times New Roman;
}
</style>
</head>
<body >
	
	<marquee behavior="alternate" bgcolor="green"><h1>HEALTH INSPECTOR</h1></marquee>

	<div class="links">

		<div>
		<button><a href="/AdminLogin" >ADMIN LOGIN</a></button><br>
			
			<button><a href="/userlogin">USER LOGIN</a></button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			
				

		</div>

		
		<button>
		<P style="font-size: 20px; font-family: Arial">
			<b style="color: red; font-family: Times New Roman"><a
				href="/NewUserRegistration">New User Registration!</a></b>
		</P>
		</button>
		

	</div>
</body>
</html>