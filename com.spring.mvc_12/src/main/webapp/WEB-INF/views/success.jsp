<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Success Page</title>
</head>
<body>
<h3>${Course} by ${Athor}</h3>
<hr>
	<%-- <h1>Hi ${Name},</h1>  if Using Request Param--%>
	<h1>Hi ${user.name},</h1> <!-- if using ModelAttribute -->
	<h1>Thank you for registering with us.</h1>
</body>
</html>