<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <link rel="stylesheet" href="styleSheets/indexStyleSheet.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<img id="homephoto" alt="" src="https://i.pinimg.com/originals/f1/ec/9a/f1ec9a1c85ed37dc5428c107b820b589.jpg">

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
  <input type="text" name="description" value=""><br><br>
  Weight:<br>
  <input type="number" name="weight" value=""><br><br>
  Size:<br>
  <input type="text" name="size" value=""><br><br>
  Diet:<br>
  <input type="text" name="diet" value=""><br><br>
  Habitat:<br>
  <input type="text" name="habitat" value=""><br><br>
  Region:<br>
  <input type="text" name="region" value=""><br><br>
  <input type="submit" value="Create">
</form>
  

<h4>Delete</h4>
<form action="deletemega.do" method="POST">
What ID to delete:<br>
<input type="text" name="id" value=""><br>
<input type="Submit" value="Submit">
</form>

<h4> Show All Megafauna in Database</h4>
<form action="list.do" method="GET">
<input type="Submit" value="Show ALl">


</form>




</form>




</body>
</html>