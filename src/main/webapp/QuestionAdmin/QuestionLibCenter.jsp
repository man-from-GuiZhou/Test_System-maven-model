<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8" name="viewport" content="width=device-width,initial-scale=1">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/StandardCSS.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/QuestionAdmin/CSS/UserCenterCSS.css">
    <title>题库管理中心</title>
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
        <table class="table">
            <caption>题库列表</caption>
            <thead>
                <tr>
                    <th>题库编号</th>
                    <th>题库类型</th>
                    <th>题库对应工作</th>
                    <th class="tdFunction">题目数量</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>职业测试</td>
                    <td>电气工程师</td>
                    <td>100</td>
                    <td class="tdFunction"><a href="QuestionCenter.html"><button class="btn btn-default">进入题库</button></a></td>
                </tr>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>