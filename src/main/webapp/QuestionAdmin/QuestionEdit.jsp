<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8" name="viewport" content="width=device-width,initial-scale=1">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/StandardCSS.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/QuestionAdmin/CSS/QuestionEditCSS.css">
    <title>题目信息编辑</title>
</head>
<body>
<h1 class="page-header">题目信息编辑</h1>
<div class="pageBody">
    <div id="questionEditDiv"><!--从这个部分开始是单个题目的添加、编辑、修改部分-->
        <form class="form-horizontal" role="form" id="questionEdit">
        <div class="form-group "><!--questionPosition用来组织内容和答案的布局-->
            <div id="questionContextDiv">
                <p>题目内容</p>
                <textarea id="questionContext" class="questionText"></textarea>
            </div>
        </div>
        <div class="form-group "><!--questionPosition用来组织内容和答案的布局-->
            <div id="questionAnswerDiv">
                <p>题目答案</p>
                <textarea  rows="10" id="questionAnswer" class="questionText"></textarea>
            </div>
        </div>
        <div class="form-group questionPosition">
            <span>题目分值设置</span><input id="questionScore" type="number">
        </div>
        <div class="form-group questionPosition buttonDiv">
                    <span>
                        <button id="questionAddButton" class="btn btn-default">添加题目</button>
                    </span>
                    <span>
                        <button id="questionEditButton" class="btn btn-default">确认修改</button>
                    </span>
         </div>
     </form>
    </div>
</div>
</body>
</html>