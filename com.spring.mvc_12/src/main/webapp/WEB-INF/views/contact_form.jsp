<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link href="<c:url value="/src/css/background.css"/>" 	rel="stylesheet"><!-- 1 way to access resources   -->
<link href="/springmvc/src/css/bootstrap.min.css" 		rel="stylesheet"> <!-- 2 way to access resources , /context-path/location defined in spring xml/css/filename  -->

<%-- <script type="text/javascript" src="<c:url value="src/js/alert.js"/> "></script> --%>

<title>Contact Details From</title>

</head>
<body>
	<div class="container mt-5 " style="width: 50%">
		<form action="contact-details" method="post">
			<h2 class="text-primary" align="center">Contact Details Form</h2>
			<div class="form-group">
				<label for="exampleFormControlInput1">Name</label> <input
					type="text" class="form-control" id="exampleFormControlInput1"
					placeholder="Full Name" name="name">
			</div>
			<div class="form-group">
				<label for="exampleFormControlInput1">ID</label> <input
					type="number" class="form-control" id="exampleFormControlInput1"
					placeholder="ID" name="id">
			</div>
			<div class="form-group">
				<label for="exampleFormControlInput1">DOB</label> <input type="text"
					class="form-control" id="exampleFormControlInput1"
					placeholder="dd/MM/yyyy" name="dob">
			</div>
			<div class="form-group">
				<label for="exampleFormControlSelect1">Select Type</label> <select
					class="form-control" id="exampleFormControlSelect1" name="type">
					<option>Individual</option>
					<option>Group</option>
				</select>
			</div>
			<div class="form-group">
				<label for="exampleFormControlSelect2">Select Courses</label> <select
					multiple class="form-control" id="exampleFormControlSelect2" name="courses">
					<option>Java</option>
					<option>Spring</option>
					<option>Hibernate</option>
					<option>J2EE</option>
					<option>SQL</option>
				</select>
			</div>
			<div class="form-group">
				<label for="exampleFormControlSelect2">Select Gender</label>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" name="gender"
						id="inlineRadio1" value="male"> <label
						class="form-check-label" for="inlineRadio1">Male</label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" type="radio" name="gender"
						id="inlineRadio1" value="female"> <label
						class="form-check-label" for="inlineRadio1">Female</label>
				</div>
			</div>
			<div class="form-group">
				<label for="exampleFormControlSelect2">Your Address</label> <input
					type="text" class="form-control" id="exampleFormControlInput1"
					placeholder="Street" name="address.street">
					<input
					type="text" class="form-control" id="exampleFormControlInput1"
					placeholder="City" name="address.city">
			</div>
			<div class="form-group" align="center">
				<button type="submit" class="btn btn-primary">Submit</button>
			</div>
		</form>
	</div>
</body>
</html>