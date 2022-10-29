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
      //  resp.setContentType("text/html");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        req.setAttribute("loginFromFrom",login);
        req.setAttribute("passFromForm", password);
        System.out.println(login+" "+password);
    }
}
