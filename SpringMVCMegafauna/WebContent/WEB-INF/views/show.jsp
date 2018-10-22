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


<div>
  <h5>${mega.name} <p>${mega.latinScientific}</p><h5>
  <p>${mega.description}</p>
  <p>${mega.weight}</p>
  <p>${mega.size}</p>
  <p>${mega.diet}</p>
  <p>${mega.habitat}</p>
  <p>${mega.region}</p>
  
  
</div>


<form action="update.do" method="POST">
<input type="hidden" name="id" value= "${mega.id }"/>
Name:
<input type="text" name="name" value="${mega.name }"><br>
Latin Scientific:
<input type="text" name="latinScientific" value="${mega.latinScientific }"><br>
Description:
<input type="text" name="description" value="${mega.description }"><br>
Weight:
<input type="number" name="weight" value="${mega.weight}"><br>
Size:
<input type="text" name="size" value="${mega.size}"><br>
Diet:<br>
<input type="text" name="diet" value="${mega.diet}"><br>
Habitat:<br>
<input type="text" name="habitat" value="${mega.habitat}"><br>
Region:<br>
<input type="text" name="region" value="${mega.region}"><br>
<input type="Submit" value="Update">
</form>  


<form action="home.do" method="GET">
<input type="Submit" value="home">


</form>



<%-- <h4>Create</h4>
<form action="createMega.do" method="POST">
  Name:<br>
  <input type="text" name="name" value="${mega.name}"><br>
  Latin Scientific:<br>
  <input type="text" name="latinScientific" value=""><br><br>
  Description:<br>
  <input type="text" name="latinScientific" value=""><br><br>
  <input type="text" name="latinScientific" value=""><br><br>
  <input type="text" name="latinScientific" value=""><br><br>
  <input type="text" name="latinScientific" value=""><br><br>
  <input type="submit" value="Submit">
</form> --%>

</body>
</html>