<%@page import="ru.util.model.Alien"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show Alien</title>
</head>

<html>
<body bgcolor="#ffdc86">

    <em>In show alien</em> <br>
    <%
        Alien a1 = (Alien) session.getAttribute("alien");
        out.println(a1);
    %> <hr>
    <a href="startpage.jsp">To -> start</a>

</body>
</html>