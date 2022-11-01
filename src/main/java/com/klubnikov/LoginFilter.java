package com.klubnikov;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter("/success.html")
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String userNameFromForm = (String) servletRequest.getServletContext().getAttribute("loginFromFrom");
        String passwordFromForm = (String) servletRequest.getServletContext().getAttribute("passFromForm");
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        if (userNameFromForm!=null && passwordFromForm!=null) {
            servletRequest.getRequestDispatcher("/success.html").forward(servletRequest, servletResponse);
        } else resp.sendError(403, "Oops, you entered wrong username or password");
    }
}
