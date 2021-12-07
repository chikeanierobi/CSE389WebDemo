<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>LOGIN</title>
</head>
<body>
<div class="container">
	<div class="row justify-content-center">
		<div class="col-md-6" style="border:2px solid;margin-top:40px;">
			<h1 class="text-center">LOGIN</h1><br>
			<form class="form-group" action="register" method="post">
				<label class="form-label" for="email address" >Email Address</label>
					<input name = "useremail" type="email" class="form-control mb-4">
				<label class="form-label" for="password" >Create Password</label>
					<input name = "password1" type="password" class="form-control mb-4">
				<button class="btn btn-primary mb-5" type="submit">Login</button>
				<button class="btn btn-primary mb-5" type="reset">Cancel</button>
			</form>
			<p>New To PDFMarket?<a href="registration.jsp"> Sign Up For Free </a><p>
		</div>
	</div>
</div>
</body>
</html>