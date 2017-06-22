<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show Student</title>
</head>
<body>
Student details for ID: ${student.id}
<br><br>
Name:${student.firstName} ${student.lastName}
<br><br>
Email:${student.email}

<br><br><br>
<a href="welcome"> Home </a>
</body>
</html>