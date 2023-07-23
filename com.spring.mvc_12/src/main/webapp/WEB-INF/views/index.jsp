<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Spring WebMVC</h1>
<% 
	String 			name 	= (String)request.getAttribute("name");
	List<String>	frinds 	= (List<String>)request.getAttribute("fds");
%>
<div>
	<h2>My name is <%= name %></h2>
</div>
<div>
	<label>My Friend :</label>
	<%
	   for (String f : frinds)
	   { %>
		   <h3><%= f %></h3>
	 <% }%>
</div>
</body>
</html>