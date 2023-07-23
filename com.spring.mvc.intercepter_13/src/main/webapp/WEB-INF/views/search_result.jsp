<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search result</title>
</head>
<body>
<%  String name = (String)request.getAttribute("name"); %>

<h3> Your Name : <%= name %></h3>
</body>
</html>