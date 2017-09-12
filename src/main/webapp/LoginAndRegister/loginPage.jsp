<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8" name="viewport" content="width=device-width,initial-scale=1">
    <title>登录页面</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/StandardCSS.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/LoginAndRegister/CSS/loginPageCss.css"> 
</head>
<body>
<div >
<h1 class="page-header">笔试考试系统</h1>
    <div id="loginDiv">
        <form action="" role="form"> <!--基本的登录页面-->
            <div id="inputMes">
                <p class="tips">账号</p>
                <input type="text" name="userId" class="form-control numInput" ><br/>
                <p class="tips">密码</p>
                <input type="password" name="passWord" class="form-control numInput"><br/>
                <div id="buttonDiv">
                <input type="submit" class="btn btn-default functionButton">
                <input type="reset" class="btn btn-default functionButton">
                </div>
                <div id="toResgister">没有账户？<a href="Register.html">注册</a></div>
            </div>
        </form>
    </div>
</div>
</body>
</html>