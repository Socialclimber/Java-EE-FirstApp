<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>404 page</title>
</head>
<body bgcolor="red">
	Error: <%= exception.getLocalizedMessage() %>
	<%
	out.print("<br>");
	out.println("Please, division by zero is not allowed in mathematics");
	%>
	
</body>
</html>