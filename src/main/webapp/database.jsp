<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Data Base</title>
</head>
<html>
<body bgcolor="yellow">

    <c:forEach items="${students}" var="s">
        ${s.name} <br/>
    </c:forEach>

    <sql:setDataSource var="db" driver="org.postgresql.Driver" url="jdbc:postgresql://localhost:5432/ksandr" user="postgres" password ="1"/>

    <sql:query var="rs" dataSource="${db}">SELECT * FROM gadges </sql:query>

    <c:forEach items="${rs.rows}" var="gadget">
        <c:out value="${gadget.gid}"></c:out> : <c:out value="${gadget.gname}"></c:out> : <c:out value="${gadget.price}"></c:out>
        <br>
    </c:forEach>

</body>
</html>