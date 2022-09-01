<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome page</title>
</head>
<html>
<body bgcolor="#73e8f2">

    <%
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");// HTTP 1.1

        response.setHeader("Pragma", "no-cache"); // HTTP 1.0

        response.setHeader("Expires", "0"); // Proxies

        if(session.getAttribute("username")==null) {
            response.sendRedirect("login.jsp");
        }
    %>

    Welcome ${username}<br>

    <a href="videos.jsp">Videos here</a>

    <form action="Logout">
        <input type="submit" value="Logout">
    </form>

</body>
</html>