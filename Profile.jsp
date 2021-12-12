<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.navbar {
  overflow: hidden;
  background-color: #333;
}

.navbar a {
  float: right;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.dropdown {
  float: right;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
  background-color: red;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {
  background-color: #ddd;
}

.dropdown:hover .dropdown-content {
  display: block;
}

.topbar{
	float: right;
	color: beige;
	text-align: center;
	padding: 22px 28px;
	text-decoration: none;
	font-size: 28px;
}

</style>
</head>
<body>
</head>
<body style="background-color:#F5F5DC">
<h1><center>PDFMarket</center></h1>  <!-- The name of the website -->

<h2><center>Welcome to the market of PDFs!</center></h2>
<h3><center>Why buy a hardcopy of a book when you can just get it for free? </center></h3>

<div class="navbar">
	<div class="dropdown">
    <button class="dropbtn">Account
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="Profile.jsp">PROFILE</a>
      <a href="login.jsp">Sign Out</a>
    </div>
  </div> 
  <a href="About.jsp">About Us</a>
  <a href="WebDemo.jsp">Home</a>
</div>

<div class="container">
	<div class="main">
		<div class="row">
			<div class="col-md-5 mt-2">
				<div class="card text-center sidebar">
					<div class="card-body">
						<img src="profilepic.jpg" class="rounded-circle" width="160">
						<div class="mt-4">
							<h4>Profile</h4>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-10 mt-1">
				<div class="card mb-4 content">
					
					<div class="card-body">
						<hr>
						<div class="row">
							<div class="col-md-10">
								<b><label class="form-label" for="full name" >Full Name</label></b>
								<input name = "fullname" type="text"  placeholder="Enter full name" class="form-control mb-6">
							</div>	
						</div>
						<br>
						<div class="row">
							<div class="col-md-4">
								<b><label class="form-label" for="email address" >Email Address</label></b>
								<input name = "useremail" type="email"  placeholder="Enter email address" class="form-control mb-4">
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-4">
								<b><label for="phone">Phone Number</label></b>
  								<input name="phone" type="tel" id="phone" placeholder="123-456-7890" pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}" required>
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-4">
								<b><label for="birthdate">DOB</label></b>
								<input name="birthdate" type="date" id="birthdate">
							</div>
						</div>
						<br>
						<div class ="row">
							<div class="col-md-6">
							<a href = "Profile.jsp">
								<button class="btn btn-primary mb-5" type="submit">Save Changes</button>
							</a>	
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>