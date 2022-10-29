//package com.klubnikov;
//
//import jakarta.servlet.*;
//import jakarta.servlet.annotation.WebFilter;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//
//@WebFilter("/login")
//public class LoginFilter implements Filter {
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        String userNameFromForm = (String) servletRequest.getServletContext().getAttribute("loginFromFrom");
//        String passwordFromForm = (String) servletRequest.getServletContext().getAttribute("passFromForm");
//        HttpServletResponse resp = (HttpServletResponse) servletResponse;
//        ServletContext context = servletRequest.getServletContext();
//
//        if (userNameFromForm.equals("alex") && passwordFromForm.equals("123")) {
//            resp.sendRedirect(context.getContextPath() + "success.html");
//        } else
//            servletRequest.getServletContext().getRequestDispatcher("/error").forward(servletRequest, servletResponse);
//        filterChain.doFilter(servletRequest, servletResponse);
//    }
//}
