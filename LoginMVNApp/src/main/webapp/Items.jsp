<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Items Page!</title>
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
	<table align="center">
 		 <tr>
    		<th>Item ID</th>
    		<th>Item Name</th> 
    		<th>Item Price</th>
  		</tr>
  		<c:forEach items="${itemsList }" var="s">
  				<tr>
    				<td>${s.itemId}</td>
   					<td>${s.itemName}</td>
    				<td>R ${s.itemPrice}</td>
  				</tr>
  		</c:forEach>
  		
	</table>
</body>
</html>