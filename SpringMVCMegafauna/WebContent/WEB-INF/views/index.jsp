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

<h1>TEST</h1>

<form action="getmega.do" method="GET">
  <input type="text" name="id"/>
  <input type="submit" value="Find Megafauna BY ID"/>
</form>

<h4>Create</h4>
<form action="createmega.do" method="POST">
  Name:<br>
  <input type="text" name="name" value=""><br>
  Latin Scientific:<br>
  <input type="text" name="latinScientific" value=""><br><br>
  Description:<br>
  <input type="text" name="latinScientific" value=""><br><br>
  <input type="text" name="latinScientific" value=""><br><br>
  <input type="text" name="latinScientific" value=""><br><br>
  <input type="text" name="latinScientific" value=""><br><br>
  <input type="submit" value="Submit">
</form>

<h4>Delete</h4>
<form action="deletemega.do" method="POST">
What ID to delete:<br>
<input type="text" name="id" value=""><br>
<input type="Submit" value="Submit">
</form>


</body>
</html>