<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            <%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>日志</title>
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
日志
<div id="in">
<h1>Spring MVC CRUD</h1>
<hr>
用户名:
<security:authentication property = "principal.username" />
<br>
<br> 
<a>角色:Admin</a>
<br>
<br> 
</div>

<input type="button" value="返回"
onclick="javascript:history.back(-1);"/>
        <table>
            <tr>
                <td>id</td>
                <td>执行事件</td>
                <td>执行时间</td>
                <td>url</td>
            </tr>
            <tbody>
            <c:forEach var="log" items="${loglist}">
                <tr>
                    <td>${log.id}</td>
                    <td>${log.operate}</td>
                    <td>${log.time}</td>
                    <td>${log.url}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

</body>
</html>