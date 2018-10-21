<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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