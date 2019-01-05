<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display page</title>
</head>
<body bgcolor="gray">
	<%
		out.println("Welcome to Java Web Mr. "+request.getAttribute("name"));
	%>
</body>
</html>