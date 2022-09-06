package ru.util;

import ru.util.DAO.AlienDao;
import ru.util.model.Alien;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/getAlien")
public class GetAlienController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int aid = Integer.parseInt(req.getParameter("id"));
        AlienDao dao = new AlienDao();
        Alien a1 = dao.getAlien(aid);

        HttpSession session = req.getSession();
        session.setAttribute("alien", a1);

        resp.sendRedirect("showAlien.jsp");
    }
}
