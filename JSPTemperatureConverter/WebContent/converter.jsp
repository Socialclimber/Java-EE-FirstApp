<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Convert Celsus to Farenheight</title>
</head>
<body>
	<%!
		double result;
	%>
	<%
		double celsus = Double.parseDouble(request.getParameter("temperature"));
		result = celsus*9/5 + 32;
		
	%>
	Farenheight equivalent of  <%= celsus %> oC is: <%= result %>F;
</body>
</html>