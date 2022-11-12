package com.klubnikov;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//@WebServlet("/login")
public class LoginServlet extends HttpServlet {

//    @Override
//    public void init() throws ServletException {
//        getServletContext().setAttribute("init-login", "alex");
//        getServletContext().setAttribute("init-pass", "123");
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String login = req.getParameter("login");
        String password = req.getParameter("password");

//        String initLogin = (String) getServletContext().getAttribute("init-login");
//        String initPass = (String) getServletContext().getAttribute("init-pass");

        String initLogin = getServletConfig().getInitParameter("init-login");
        String initPass = getServletConfig().getInitParameter("init-pass");

        if (login.equals(initLogin) && password.equals(initPass)) {
            req.getSession().setAttribute("loginFromSession", login);
            req.getSession().setAttribute("passFromSession", password);
        }
        resp.sendRedirect("/success.html");
    }
}
