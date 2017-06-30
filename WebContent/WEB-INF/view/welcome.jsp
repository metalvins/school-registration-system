<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>WELCOME</title>
</head>
<body>
Welcome to the Student Registration System
<br><br>
<input type = "button" value = "List All Students"
	onclick="window.location.href='listAllStudents'; return false;" />

<input type = "button" value = "Find Student"
	onclick="window.location.href='findStudent'; return false;" />

<input type = "button" value = "Add Student"
	onclick="window.location.href='addStudent'; return false;" />

<input type = "button" value = "Update Student"
	onclick="window.location.href='updateStudent'; return false;" />

<input type = "button" value = "Delete Student"
	onclick="window.location.href='deleteStudent'; return false;" />

<br><br>

<input type = "button" value = "List All Courses"
	onclick="window.location.href='listAllCourses'; return false;" />

<input type = "button" value = "Find Course"
	onclick="window.location.href='findCourse'; return false;" />

<input type = "button" value = "Add Course"
	onclick="window.location.href='addCourse'; return false;" />

<input type = "button" value = "Update Course"
	onclick="window.location.href='updateCourse'; return false;" />

<input type = "button" value = "Delete Course"
	onclick="window.location.href='deleteCourse'; return false;" />

<br><br>

<input type = "button" value = "Register Student for Course"
	onclick="window.location.href='registerStudentForCourse'; return false;" />

<br><br>

<input type = "button" value = "Show Courses for Student"
	onclick="window.location.href='showCoursesForStudent'; return false;" />

<br><br>

<input type = "button" value = "Show Students for Course"
	onclick="window.location.href='showStudentsForCourse'; return false;" />

<br><br>
</body>
</html>