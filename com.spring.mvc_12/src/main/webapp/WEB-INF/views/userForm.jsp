<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
<h3>${Course} by ${Athor}</h3>
<form action="userDetails" method="post" name="userForm">
	<h1 align="center">Registartion</h1>
	<div align="center">
		<input type="text" name="name" placeholder="User Name"></br>
		<input type="text" name="email" placeholder="User Email"></br>
		<input type="text" name="city" placeholder="User City"></br>
		<input type="number" name="pincode" placeholder="City Pincode"></br>
		<button type="submit">Submit</button>
	</div>
</form>
</body>
</html>