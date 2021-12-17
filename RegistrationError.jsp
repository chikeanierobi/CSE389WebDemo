<!-- Error page that gets displayed when registration is unsuccessful (the email address is already existing) -->
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
<title>REGISTRATION</title>
</head>
<body>

<!-- Allows us to create a form that allows the user put in their information as they register to gain access to the webSite -->
<div class="container">
	<div class="row justify-content-center">
		<div class="col-md-6" style="border:4px solid;margin-top:40px;">
			<h1 class="text-center">SIGN UP TO GET ACCESS TO PDFMarket</h1><br>
			<form class="form-group" action="registration" method="post">
				<b><label class="form-label" for="email address" >Email Address</label></b>
					<input name = "useremail" type="email" placeholder="Enter email address" class="form-control mb-4">
				<b><label class="form-label" for="username" >UserName</label></b>
					<input name = "username" type="text" placeholder="Enter username" class="form-control mb-4">
				<b><label class="form-label" for="password" >Create Password</label></b>
					<input name = "password1" type="password" placeholder="Enter password" class="form-control mb-4">
				<b><label class="form-label" for="password2" >Confirm Password</label></b>
					<input name = "password2" type="password" placeholder="Enter password again" class="form-control mb-4">
				<b><label class= "form-label" for="phone">Phone Number</label></b>
  					<input name="phone" type="tel" id="phone" placeholder="123-456-7890" class="form-control mb-4" pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}" required >
  				<b><label class= "form-label" for="birthdate">DOB</label></b>
					<input name="birthdate" type="date" id="birthdate" class="form-control mb-4">
				<!-- Button was created to lead the user to the homepage -->
				<button class="btn btn-primary mb-5" type="submit">Sign Up</button>
				<!-- Button was created in order to basically clear the form -->
				<button class="btn btn-primary mb-5" type="reset">Cancel</button>
			</form>
			<!-- In case the user has an existing account, they can simply choose the login option -->
			<p><b>Already Have An Account?</b> <a href="login.jsp"> Login </a><p>
			<h2>Please enter valid credentials</h2>
		</div>
	</div>
</div>
</body>
</html>