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
Please enter the details:
	<form:form action="dropCourse" modelAttribute="studentCourse">
	Student ID: <form:input path="pk.studentID" />
	<br><br>
	Course Name: <form:input path="pk.course_name" />
	<br><br>
	<input type="submit" value="Submit" />
	</form:form>
</body>
</html>