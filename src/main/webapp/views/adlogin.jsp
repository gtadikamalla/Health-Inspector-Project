<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
</head>
<body>
 <div align="center">
  <marquee behavior="alternate" bgcolor="green"><h1>Admin Login</h1></marquee>
 <form action="${pageContext.request.contextPath}/admin" method="post" >
   <table style="with: 100%">
    <tr>
     <td>User ID:</td>
     <td><input type="text" placeholder="Enter your User Id" name="id" required pattern="^[0-9]+$"  title="It must contain only digits"/></td>
    </tr>
    <tr>
     <td>Password:</td>
     <td><input type="password" placeholder="Enter your Password" name="password" required  title="It must contain only alphabets"/></td>
    </tr>

   </table>
   <br><input type="submit" value="Login" /><br><br>
               <a href="/">Go Back</a>
   
  </form>
 </div>
</body>
</html>