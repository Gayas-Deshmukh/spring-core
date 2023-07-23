<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Use Of Expression & JSTL Tags</title>
</head>
<body>
<div>
  <!-- expression -->
<h2>Course name  : 
     ${course}</h2>
</div>

<div>
 <c:forEach var="item" items="${courses	}">
 	<h1><c:out value="${item}"></c:out></h1>
 </c:forEach>
</div>
</body>
</html>