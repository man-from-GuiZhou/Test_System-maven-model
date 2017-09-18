<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8" name="viewport" content="width=device-width,initial-scale=1">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/StandardCSS.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/CSS/QuestionLibEditCSS.css"> 
    <title>新增</title>
</head>
<body>
<div id="pageBody">
    <h1>题库添加</h1> 
    <form action="QuestionLibCenter?operate=add" class="libForm" role="form" method="post">
        <div class="form-group">
            <input type="text" class="form-control inputBox" name ="testpage_lib_type"   placeholder="请输入题库类型">
        </div>
        <div class="form-group">
            <input type="text" class="form-control inputBox" name ="testpage_job"  placeholder="请输入题库目标职位">
        </div>
        <input type="submit" class="btn btn-default"  name="lib_submit" value="确认提交题库信息">
    </form>
</div>
</body>
</html>