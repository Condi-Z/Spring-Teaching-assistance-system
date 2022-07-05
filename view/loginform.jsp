<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>用户登录</title>
  <link rel="stylesheet" href="https://at.alicdn.com/t/font_2815799_wbova6arjq.css">
  <style>
    * {
      padding: 0;
      margin: 0;
    }
   
    .box {
      width: 600px;
      height: 300px;
      display: flex;
      flex-direction: column;
      margin: 200px auto;
      color: white;
    }
    .click {
      width: 100%;
      height: 20%;
      line-height: 60px;
      text-align: center;
      background-color: blue;
    }
    .input {
      height: 80%;
      border: 1px solid blue;
      position: relative;
    }
    input {
      display: block;
      width: 180px;
      margin: 40px auto;
      outline: none;
      border: 0px;
      background-color: transparent;
      border-bottom: 2px solid blue;
      font-size: 18px;
      z-index: 999;
    }
    span {
      width: 32px;
      height: 0px;
      position: absolute;
      display: block;
      left: 209px;
      top: 39px;
      color: #ccc;
    }
    #password {
      top: 103px;
    }
    button {
      position: relative;
      display: block;
      margin: auto;
      width: 75px;
      height: 35px;
      border: 0;
      transition: all 0.8s ease-in-out 0.3s;
      background-color: white;
    }
    button:hover {
      background-color: blue;
      color: white;
    }
    button::before,button::after {
      position: absolute;
      content: '';
      width: 13px;
      height: 13px;
      border: 2px solid blue;
      transition: width 0.2s ease-in-out 0.15s;
    }
    button::before {
      left: 0;
      top: 0;
      border-right: 0;
      border-bottom: 0;
    }
    button::after {
      right: 0;
      bottom: 0;
      border-top: 0;
      border-left: 0;
    }
    button:hover::before {
      width: 73px;
      height: 33px;
    }
    button:hover::after {
      width: 73px;
      height: 33px;
    }
    
    .icon-icon-4:before {
      content: "\e600";
      position: absolute;
      left: 439px;
      top: 266px;
      color: blue;
    }
    .icon-mima:before {
      content: "\e69e";
      position: absolute;
      left: 439px;
      top: 331px;
      color: blue;
    }
    .failed{
		color:red;
	}
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
<br><br><br>
<div id="in">
<h1>Spring MVC CRUD</h1>
<hr>
<br><br><br>
<c:if test="${param.error != null}">
<i class="failed">认证失败，用户名/密码错误</i>
</c:if><br>
</div>
<form:form action="${pageContext.request.contextPath}/checkTheUser" method="POST">
  <div class="box">
    <div class="click">点击收起/展开</div>
    <div class="input">
      <input type="text" name="username" id="">
      <span>账号</span>
      <span id="password">密码</span>
      <input type="password" name="password" id="">
      <button>确定</button>
    </div>
    
  </div>
</form:form>
 
  <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
  <script>
    $(function() {
      // 字体颜色变为pink色
      $('.input input').eq(0).click(function() {
        $('span').eq(0).animate({top: '19px'},function() {
          $(this)[0].style.color = "blue";
        });
      });

      $('.input input').eq(1).click(function() {
        $('span').eq(1).animate({top: '83px'},function() {
          $(this)[0].style.color = "blue";
        });
      });

      var flag = true;
      $('.click').click(function() {
        $('.input').slideToggle();
        if(flag) {
          $('.box span').hide();
          flag = false;
        } else {
          $('.box span').show();
          flag = true;
        }
        
      });

    })
  </script>
</body>
</html>