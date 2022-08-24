package ru.util;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Student> studs = Arrays.asList(new Student(1, "Sasha"), new Student(2, "Anya"),
                new Student(3, "Filip"));

        request.setAttribute("students", studs);
        RequestDispatcher rd = request.getRequestDispatcher("database.jsp");
        rd.forward(request, response);
    }
}
