package com.klubnikov;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter("/success.html")
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        String userNameFromSession = (String) req.getSession().getAttribute("loginFromSession");
        String passwordFromSession = (String) req.getSession().getAttribute("passFromSession");

        if (userNameFromSession!=null && passwordFromSession!=null) {
            servletRequest.getRequestDispatcher("/success.html").forward(servletRequest, servletResponse);
        } else resp.sendError(403, "Oops, you entered wrong username or password");
        req.getSession().removeAttribute("loginFromSession");
        req.getSession().removeAttribute("passFromSession");
    }
}
