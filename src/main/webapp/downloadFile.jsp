<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page isELIgnored="false" %>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Download File</title>
</head>
<html>
<body bgcolor="#8ac7f8">

    <div>
        <a>Here we adding files</a>
    </div>

    <form action="upload" method="post" enctype="multipart/form-data">

        <input type="file" name="file" multiple/> <br>
        <input type="submit">
    </form>

</body>
</html>