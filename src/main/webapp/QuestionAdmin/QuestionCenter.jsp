<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8" name="viewport" content="width=device-width,initial-scale=1">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/StandardCSS.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/QuestionAdmin/CSS/QuestionCenterCSS.css">
    <title>考试试题中心</title>
</head>
<body>
    <div id="pageBody">
        <h1 class="page-header">题目中心页面</h1>
        <h2 class="libInfo">XX题库</h2>
    <div id="questionList"><!--这里可以查看题目列表-->
        <table class="table table-hover">
            <caption>题目列表</caption>
                <thead>
                    <tr>
                        <th>题目编号</th>
                        <th>题目所属类型</th>
                        <th>题目内容</th>
                        <th>题目答案</th>
                        <th>题目分值</th>
                    </tr>
                </thead>
            <tbody>
                <c:forEach var="question" items="questionList" varStatus="Count">
                <tr>
                    <td>${Count.count}</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td id="tdButton">
                        <span><a href="QuestionEdit.html"><button class="btn btn-default EditButton">修改题目</button></a></span>
                        <span><button class="btn btn-default EditButton">删除题目</button></span>
                    </td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
        </div>
        <div id="addQuestionDiv">
            <label class="tips">选择题目类型</label>
            <form role="form">
                <div class="form-group">
                    <select class="form-control" id="questionType">
                        <option>主观题</option>
                        <option>客观题(选择题)</option>
                    </select>
                </div>
            </form>
        </div>
        <button id="addQuestion" class="btn btn-default">添加题目</button>
        <div class="searchDiv">
            <input  type="text" id="questionId" placeholder="输入题目条件" class="form-control">
        </div>
        <button id="searchButton" class="btn btn-default">搜索</button>
    </div>
</body>
</html>