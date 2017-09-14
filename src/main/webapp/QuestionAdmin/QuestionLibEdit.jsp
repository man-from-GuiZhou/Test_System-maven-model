<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head lang="en">
    <meta charset="UTF-8" name="viewport" content="width=device-width,initial-scale=1">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="CSS/StandardCSS.css">
    <link rel="stylesheet" type="text/css" href="CSS/QuestionLibEditCSS.css">
    <title>题库编辑</title>
</head>
<body>
<div id="pageBody">
    <h1>题库编辑</h1>
    <form class="libForm" role="form">
        <div class="form-group">
            <input type="hidden" name="testpage_lib_id" value="">
        </div>
        <div class="form-group">
            <input type="text" class="form-control inputBox" name="testpage_lib_type" value="" placeholder="请输入题库类型">
        </div>
        <div class="form-group">
            <input type="text" class="form-control inputBox" name="testpage_job" value="" placeholder="请输入题库目标职位">
        </div>
        <div class="form-group">
            <label>题库题目数量</label>
            <input type="number" class="form-control inputBox" name="question_num" readonly="readonly">
        </div>
        <input type="submit" class="btn btn-default"  name="lib_submit" value="确认提交题库信息">
    </form>
</div>
</body>
</html>