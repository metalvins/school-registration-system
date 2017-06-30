<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register Student</title>
</head>
<body>
Please enter the Course Name:
	<form:form action="studentsForCourse" modelAttribute="course">
	Course Name: <form:input path="courseName" />
	<br><br>
	<input type="submit" value="Submit" />
	</form:form>
	
<br><br><br>
<a href="welcome"> Home </a>
</body>
</html>
</body>
</html>