<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
         <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
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
</head>
<body>
<div id="in">
<h1>Spring MVC CRUD</h1>
<hr>


用户名:
<security:authentication property = "principal.username" />
<br>
<br> 
<security:authorize access = "hasRole('Student')">
<a>角色:Student</a>
</security:authorize>
<security:authorize access = "hasRole('Teacher')">
<a>角色:Teacher</a>
</security:authorize>
<security:authorize access = "hasRole('Admin')">
<a>角色:Admin</a>
</security:authorize>
<br>
<br>
<security:authorize access = "hasRole('Student')">
<a href="./Condiapp/Student">写作业</a><br><br>
</security:authorize>

<security:authorize access = "hasRole('Teacher')">
<a href="./Condiapp/Teacher">布置作业</a><br><br>
</security:authorize>

<security:authorize access = "hasRole('Admin')">
<a href="./Condiapp/Log">系统日志</a><br><br>
</security:authorize>

<a href="./Condiapp/Passw"><button>修改密码</button></a>

<br>
<br>
<form:form action = "${pageContext.request.contextPath}/logout" method = "POST">
	<input type = "submit" value = "退出登录"/>
</form:form>

</div>


</body>
</html>

