<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Item</title>
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
	<h1>Register Items in the System</h1>
	<form action="RegisterItems">
		 <div class="imgcontainer">
    			<img src="img_avatar2.png" alt="Avatar" class="avatar">
 		</div>
 		
 		<div class="container">
 			<label for="itemId"><b>Item ID:</b></label>
			<input type="text" name="itemId" placeholder="Eneter Item ID"><br><br>
			<label for="itemName"><b>Item Name:</b></label>
		    <input type="text" name="itemName" placeholder="Eneter Item Name"><br><br>
		    <label for="itemPrice"><b>Item Price: </b></label>
			<input type="text" name="itemPrice" placeholder="Eneter Item price"><br>
					<button type="submit">Add Item</button><br>
		</div>
					
	</form>
</div>
</body>
</html>