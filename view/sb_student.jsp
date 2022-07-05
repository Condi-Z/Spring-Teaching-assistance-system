<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生端</title>
<style>
	#out{
		background:bule;
		width:600px;
		height:300px;
	}
	#in{
		
		width:300px;
		height:150px;
		margin:0 auto;
		text-align:center;
	}
</style>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
学生端
<div id="in">
<h1>Spring MVC CRUD</h1>
<hr>
用户名:
<security:authentication property = "principal.username" />
<br>
<br> 
<a>角色:Student</a>
<br>
<br> 
</div>
<input type="button" value="新增作业"
onclick="window.location.href='addTeacher';return false;"/>

<table>
<tr>
<td>id</td>
<td>作业描述</td>
<td>学生姓名</td>
<td>提交时间</td>
</tr>
<c:forEach var="teacher" items="${teacherlist}">
<tr>
<td>${teacher.id}</td>
<td>${teacher.job}</td>
<td>${teacher.sname}</td>
<td>${teacher.homework}</td>

</tr>
</c:forEach>
</table>
</body>
</html>