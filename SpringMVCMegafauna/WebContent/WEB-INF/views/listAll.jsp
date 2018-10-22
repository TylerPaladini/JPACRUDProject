<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4>List of All Megafauna</h4>

<c:forEach items="${megas }" var="mega">

<p>ID: ${mega.id} Name: ${mega.name}</p>

</c:forEach>

<form action="home.do" method="GET">
<input type="Submit" value="home">


</form>

</body>
</html>