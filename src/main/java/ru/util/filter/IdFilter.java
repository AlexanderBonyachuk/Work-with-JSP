package ru.util.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/addAlien")
public class IdFilter implements javax.servlet.Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        PrintWriter out = servletResponse.getWriter();

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        int aid = Integer.parseInt(servletRequest.getParameter("aid"));

        if (aid > 1) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            out.println("Invalid Input");
        }
    }

    @Override
    public void destroy() {

    }
}
