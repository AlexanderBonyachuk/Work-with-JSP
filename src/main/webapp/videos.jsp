<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Video page</title>
</head>
<html>
<body bgcolor="#e27d21">

    <%

        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");// HTTP 1.1

        response.setHeader("Pragma", "no-cache"); // HTTP 1.0

        response.setHeader("Expires", "0"); // Proxies

        if(session.getAttribute("username")==null) {
            response.sendRedirect("login.jsp");
        }
    %>

    <iframe width="560" height="315" src="https://www.youtube.com/embed/OuBUUkQfBYM?start=16405" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

</body>
</html>