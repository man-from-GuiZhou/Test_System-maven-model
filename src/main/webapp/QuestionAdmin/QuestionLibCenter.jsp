<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8" name="viewport" content="width=device-width,initial-scale=1">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
      <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/StandardCSS.css">
     <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/QuestionAdmin/CSS/UserCenterCSS.css"> 
    <title>题库管理中心</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js">
	</script>
	<script type="text/javascript" src="JS/QuestionAdminAjax.js"></script>
</head>
<body>
<div class="pageContent">
    <div class="PageInfoTitle">
        <h1>题库管理中心</h1>
    </div>
    <div class="userInfoDiv">
        <p class="userInfo">题库管理员：</p>
    </div>
    <div id="QuesLibDiv">
        <table >
            <caption>题库列表</caption> 
            <thead>
                <tr>
                    <th>题库编号</th>
                    <th>题库类型</th>
                    <th>题库对应工作</th>
                    <th class="tdFunction">题目数量</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="lib" items="${libList}">
            		<tr> 
            	    <td>${lib.question_lib_id}</td>
                    <td>${lib.testpage_type}</td>
                    <td>${lib.testpage_job}</td>
                    <td>${lib.question_num}</td>
                    <td class="tdFunction"><span><a href="QuestionLibCenter?lib_id=${lib.question_lib_id}&operate=enterEdit "><button class="btn btn-default">修改题库</button></a></span>
                     <span><button id="removeButton" class="btn btn-default" onclick="remove(12)">删除题库</button></span> 
                   	 </td>
           			</tr>
            </c:forEach>         
            </tbody>
        </table>
        <a href="QuestionAdmin/QuestionLibAdd.jsp"><button class="btn btn-default">新增题库</button></a>
    </div>
</div>
</body>
</html>