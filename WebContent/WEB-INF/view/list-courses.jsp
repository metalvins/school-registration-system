<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student List</title>

<link type="text/css"
	  rel="stylesheet"
	  href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>Student Registration System</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>Course Name</th>
					<th>Teacher</th>
					<th>Days</th>
					<th>Time</th>
				</tr>
				
				<c:forEach var = "course" items = "${courses}" >
				
					<tr>
						<td> ${course.courseName} </td>
						<td> ${course.teacher} </td>
						<td> ${course.days} </td>
						<td> ${course.time} </td>
					</tr>
				</c:forEach>
			</table>
		
		
		</div>
	</div>

<br><br><br>
<a href="welcome"> Home </a>
</body>
</html>