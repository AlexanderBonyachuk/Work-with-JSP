<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Video page</title>
</head>
<html>
<body>

    <%
        if(session.getAttribute("username")==null) {
            response.sendRedirect("login.jsp");
        }
    %>

    <a href="https://www.youtube.com/watch?v=OuBUUkQfBYM">video 1</a>

</body>
</html>