<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.Statement,java.util.Random"%>

    <%@ page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home JSP Page</title>
</head>
<body>
    <%
        int coef = 3;
    %>
    <h1>Hello word from HOME!</h1>
    <%
        out.println(7+5);
    %>
    <hr>
        My favorite number is: <%= coef %>
    <hr>
        <%= 7+11 %>
    <hr>
        <a href="add.jsp">To -> ADD</a>
    <hr>
</body>
</html>