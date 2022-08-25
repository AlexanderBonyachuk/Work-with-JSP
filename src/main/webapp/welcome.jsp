<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome page</title>
</head>
<html>
<body bgcolor="#73e8f2">

    <%
        if(session.getAttribute("username")==null) {
            response.sendRedirect("login.jsp");
        }
    %>

    Welcome ${username}
</body>
</html>