<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <link rel="stylesheet" href="styleSheets/indexStyleSheet.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>North American Pleistocene Megafauna</title>
</head>
<body>

<img id="homephoto" alt="" src="https://mir-s3-cdn-cf.behance.net/project_modules/disp/2eb40f34094122.56c3d0503f08d.jpg">
<h3>North American Pleistocene Megafauna</h3>

<h5> Show All Megafauna in Database</h5>
<form action="list.do" method="GET">
<input type="Submit" value="Show All">
</form>
<h5>Choose Megafauna with ID#:</h5>
<form action="getmega.do" method="GET">
  <input type="text" name="id"/>
  <input type="submit" value="Find"/>
</form>

<h5>Create Your Own Megafauna</h5>
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
  

<h5>Delete From the Database</h5>
<form action="deletemega.do" method="POST">
What ID to delete:<br>
<input type="text" name="id" value=""><br>
<input type="Submit" value="Delete">
</form>



</form>




</form>




</body>
</html>