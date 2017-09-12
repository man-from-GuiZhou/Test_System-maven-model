<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8" name="viewport" content="width=device-width,initial-scale=1">
    <title>用户注册</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/LoginAndRegister/CSS/StandardCSS.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/LoginAndRegister/CSS/RegisterCSS.css">
</head>
<body>
<div id="pagebody">
<h1 class="page-header">注册页面</h1>
<div id="registerBody">
    <form class="form-horizontal" action="loginPage.html" role="form">
        <div class="form-group">
            <input type="text" class="form-control" id="userName" placeholder="请输入用户名/邮箱">
        </div>
        <div class="form-group">
            <input type="password" class="form-control" id="password" placeholder="请输入你的密码">
        </div>
        <div class="form-group">
            <input type="password" class="form-control" id="repassword" placeholder="请再次输入你的密码">
        </div>
        <div class="form-group">
            <input type="hidden" value="1" id="type">
        </div>
        <div class="form-group">
            <input type="submit" class="btn btn-default submitButton" value="提交">
        </div>
    </form>
</div>
</div>
</body>
</html>