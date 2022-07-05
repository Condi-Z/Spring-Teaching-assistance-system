<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>

<!DOCTYPE html>
<html>
<%

java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//定义时间格式，不想要时分秒的话，也可以只是yyyy-MM-dd

java.util.Date currentTime = new java.util.Date();

String NowTime = formatter.format(currentTime); 

%>
<head>
<meta charset="UTF-8">
<title>新增\修改作业内容</title>
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
新增\修改作业内容
<div id="in">
<h1>Spring MVC CRUD</h1>
<hr>
用户名:
<security:authentication property="principal.username" scope="session" var="username" />${username}
<br>
<br>
<a>角色:Teacher</a>
<br>
<br> 
</div>
<hr>
<form:form action="addTeacherProcess" modelAttribute="teacher" method="POST">
<form:hidden path="id"/>
描述:<form:input path="job"/><br/>
截止时间:<form:input path="etime"/><br/>
<form:hidden value="${username}" path="who"/>
<form:hidden value="<%= NowTime %>" path="stime"/>
<form:hidden value="0" path="submit"/>
<input type="submit" value="提交">
</form:form>

</body>
</html>