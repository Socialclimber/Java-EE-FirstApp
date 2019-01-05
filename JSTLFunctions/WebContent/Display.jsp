<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Page</title>
</head>
<body>

	Words in the String:
	<c:forEach items="${fn:split(n,' ')}" var="s">
		<br/>
		
		${s}
	</c:forEach>
	<br/>
	Number of words in Sentence: ${len}
</body>
</html>