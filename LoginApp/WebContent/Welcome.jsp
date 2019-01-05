<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page!</title>
</head>
<body>
 Welcome to this App Mr.<%= session.getAttribute("username") %>
</body>
</html>