package ru.util.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Login")
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");

        if(uname.equals("telusko") && pass.equals("1")){
            HttpSession session = req.getSession();
            session.setAttribute("username", uname);
            resp.sendRedirect("welcome.jsp");
        } else {
            resp.sendRedirect("login.jsp");
        }
    }

}
