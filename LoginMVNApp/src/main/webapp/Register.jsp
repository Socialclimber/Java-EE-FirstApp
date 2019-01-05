<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
 <link rel = "stylesheet" type = "text/css" href = "styling.css" />
</head>
<body bgcolor="margenta">
	<div class="header">
  		<a href="index.jsp" class="logo">Company Logo</a>
  		<div class="header-right">
    		<a class="active" href="index.jsp">Home</a>
    		<a href="Login.jsp">Login</a>
    		<a href="Register.jsp">Create Account</a>
   			<a href="RegisterItem.jsp">Add Item</a>
  		</div>
	</div>
	<div align="center">
		<h2> Create Account</h2>
		<form action="Register" method="post">
			 <div class="imgcontainer">
    			<img src="img_avatar2.png" alt="Avatar" class="avatar">
 			</div>
 			
 			<div class="container">
				<label for="userId"><b>User ID:</b></label>
				<input type="text" name="userId" placeholder="Eneter user ID"><br><br>
				<label for="firstName"><b>First Name: </b></label>
				<input type="text" name="firstName" placeholder="Eneter first Name"><br><br>
				<label for="secondName"><b>Second Name: </b></label>
				<input type="text" name="secondName" placeholder="Eneter Second Name"><br><br>
				<label for="userName"><b>UserName: </b></label>
				<input type="text" name="userName" placeholder="Eneter User Name"><br><br>
				<label for="email"><b>Email Address: </b></label>
				<input type="text" name="email" placeholder="Eneter first Address"><br><br>
				<label for="password"><b>Password: </b></label>
				<input type="password" name="password" placeholder="Enter you password"><br><br>
					<button type="submit">Register</button><b><a href="Login.jsp">Login</a></b><br>
			</div>
					
		</form>
	</div>
</body>
</html>