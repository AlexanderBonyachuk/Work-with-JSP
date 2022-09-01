package ru.util.login;

import ru.util.DAO.LoginDao;

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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");

        LoginDao dao = new LoginDao();

        if (dao.check(uname, pass)) {
            HttpSession session = req.getSession();
            session.setAttribute("username", uname);
            resp.sendRedirect("welcome.jsp");
        } else {
            System.out.println("Wrong password or user");
            resp.sendRedirect("login.jsp");
        }
    }

}
