<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>User</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
</head>
<body>
 <div align="center">
  <marquee behavior="alternate" bgcolor="green"><h1>User Login</h1></marquee>
 <form  name="user" action="/doctor" method="post" onsubmit="return loginVal()">
   <table style="with: 100%">
    <tr>
     <td>User Registration ID:</td>
     <td><input type="text" placeholder="Enter your User Id" name="idd"  required pattern="^[0-9]+$" title="it contains only digits"/></td>
    </tr>
    <tr>
     <td>Password:</td>
     <td><input type="password" placeholder="Enter your Password" name="password" required/></td>
    </tr>

   </table>
   <br><input type="submit" value="Submit" /><br><br>
               <a href="/">Go Back</a>
   
  </form>
 </div>
</body>
</html>