<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login </title>
</head>
<body>
	<%
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username.equals("socialclimber")){
			out.println("Welcome Mr. "+username);
		}else{
			
			out.println("Invalid credentials!");
		}
		
	%>

</body>
</html>