<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <#include "common/head.ftl">
    <title>Title</title>
</head>
<body>
单个文件上传：
<form action="upload/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="submit" value="提交上传">
</form>
</body>
</html>