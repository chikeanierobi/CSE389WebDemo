<!-- Error page that gets displayed when login is unsuccessful -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
	body{
		background-image:url(LoginPagePicture.jpg);
		background-size: cover;
		background-attachment: fixed;
	}
	.content{
		background: black;
		width: 50%;
		padding: 40px;
		margin: 100px auto;
		font-family: calibri;
	}
	p{
		font-size: 25px;
		color: black;
	}
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>LOGIN</title>
</head>
<body>

<div class="container">
	<div class="row justify-content-center">
		<div class="col-md-6" style="border:2px solid;margin-top:40px;">
			<h1 class="text-center">LOGIN</h1><br>
			<form class="form-group" action="login.jsp" method="post">
				<!-- Field for user to enter email address -->
				<b><label class="form-label" for="email address" >Email Address</label></b>
					<input name = "useremail" type="email" placeholder="Enter username" class="form-control mb-4">
				<!-- Field for user to enter password -->
				<b><label class="form-label" for="password" >Password</label></b>
					<input name = "password1" type="password" placeholder="Enter password" class="form-control mb-4">
				<!-- Button to redirect user to home page if login is successful -->
				<a href = "WebDemo.jsp">
					<button class="btn btn-primary mb-5" type="submit">Login</button>
				</a>
				<!-- Button to reset fields if user changes their mind about the input they put in -->
				<button class="btn btn-primary mb-5" type="reset">Cancel</button>
			</form>
			<!-- Option to register if user doesn't have an already existing account -->
			<p><b>New To PDFMarket?</b><a href="registration.jsp"> Sign Up For Free </a><p>
			<!-- Error message -->
			<h2>Please enter valid credentials</h2>
		</div>
	</div>
</div>
</body>
</html>