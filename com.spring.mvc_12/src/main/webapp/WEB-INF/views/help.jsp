<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help</title>
</head>
<body>
<%
	String name = (String) request.getAttribute("name");
	String city = (String) request.getAttribute("city");
%>
</body>
<h1>My name is <%= name %></h1>
<h1>My city is <%= city %></h1>
</html>