<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Course</title>
</head>
<body>
Please enter the details for the Course.
	<form:form action="getAddCourse" modelAttribute="course">
	Course Name: <form:input path="courseName" />
	<br><br>
	Teacher: <form:input path="teacher" />
	<br><br>
	Days: <form:input path="days" />
	<br><br>
	Time: <form:input path="time" />
	<br><br>
	<input type="submit" value="Submit" />
	</form:form>

<br><br><br>
<a href="welcome"> Home </a>
</body>
</html>