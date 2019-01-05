<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page!</title>
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
	<form action="Login" method="post">
		 <div class="imgcontainer">
    		<img src="img_avatar2.png" alt="Avatar" class="avatar">
 		</div>
 		
 		<div class="container">
 			<label for="username"><b>Username</b></label>
			<input type="text" name="username" placeholder="Eneter UserName!"><br>
			<label for="password"><b>Password</b></label>
			<input type="password" name="password" placeholder="Eneter Password!"><br>
			<button type="submit">Login</button>
			<label>
      			<input type="checkbox" checked="checked" name="remember"> Remember me
    		</label>
			<br><b><a href="Register.jsp">Create Account</a></b>
		</div>	 
	</form>
</div>
</body>
</html>