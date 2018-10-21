<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="update.do" method="POST">
<input type="hidden" name="id" value= "${mega.id }"/>
Name:
<input type="text" name="name=" value="${mega.name }"><br>
Latin Scientific:
<input type="text" name="latinScientific" value="${mega.latin_scientific }"><br>
Description:
<input type="text" name="description" value="${mega.description }"><br>
Weight:
<input type="text" name="weight" value="${mega.weight}"><br>
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
</body>
</html>