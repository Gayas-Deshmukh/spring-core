<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Uploaded File</title>
</head>
<body>
 <h1> Uploaded File</h1>
 
 <img alt="File" src="<c:url value="/src/images/${fileName}" />" />
</body>
</html>