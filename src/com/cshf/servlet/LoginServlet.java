package com.cshf.servlet;

import com.cshf.dao.UserDAO;

import com.cshf.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
//        String path="index.jsp";
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        UserDAO userDao = new UserDAO();
        User user = userDao.login(username, password);
        if (user!=null){
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("reg.jsp").forward(request, response);
        }
    }
}
