package ru.util;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/addAlien")
public class AlienServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        System.out.println("in servlet Alien");

        int aid = Integer.parseInt(req.getParameter("aid"));
        String aname =req.getParameter("aname");

        out.println("welcome " + aname);
    }
}
