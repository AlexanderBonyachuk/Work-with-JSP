<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JDBC connect</title>
</head>
<html>
<body bgcolor="GREY">
    <h1>Checking SQL:</h1>
    <br>

    <%
        String url = "jdbc:postgresql://localhost:5432/ksandr";
        String username = "postgres";
        String password = "1";
        String sql = "SELECT * FROM students WHERE rollno = 103";
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(sql);
        rs.next();

    %>

    Rollno : <%= rs.getString(1) %> <br>
    Name : <%= rs.getString(2) %> <br>
    Marks : <%= rs.getString(3) %> <br>

</body>
</html>