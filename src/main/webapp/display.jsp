<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Functions JSTL</title>
</head>
<html>
<body bgcolor="#8ac7f8">

    <c:set var="str" value="Sanya born to coding Java"/>

    Length : ${fn:length(str)} <hr>

    <c:forEach items="${fn:split(str,' ')}" var="s">
        ${s}
        <br>
    </c:forEach>
    <hr>

    index : ${fn:indexOf(str, "to")}
    <hr>

    Is there : ${fn:contains(str, "Java")}
    <hr>

    <c:if test="${fn:endsWith(str,'Java')}">
        Java is there!
    </c:if>
    <hr>

</body>
</html>