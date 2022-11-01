package com.klubnikov;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        if (login.equals("alex") && password.equals("123")) {
            req.getServletContext().setAttribute("loginFromFrom", login);
            req.getServletContext().setAttribute("passFromForm", password);
        }
        resp.sendRedirect("/success.html");
    }
}
