<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="/springmvc/src/css/bootstrap.min.css" rel="stylesheet"><!-- 2 way to access resources , /context-path/location defined in spring xml/css/filename  -->
<title>File Upload</title>

</head>
<body>
	<div class="container mt-5">
		<h1 class="text-secondary">Upload File</h1>
		<form action="get-file"  method="post" enctype="multipart/form-data">
			<div class="form-group">
				<label for="exampleFormControlFile1">Select the file</label> 
				<input
					type="file" class="form-control-file" name="profile" id="exampleFormControlFile1">
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-primary">Upload</button>
			</div>
		</form>
	</div>
</body>
</html>