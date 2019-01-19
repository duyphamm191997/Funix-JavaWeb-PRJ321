/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.User;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.MessageError;
import model.UserDao;

/**
 *
 * @author demonslight998
 */
public class SignUpHanlding extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    UserDao userDao = new UserDao();
    HttpSession session = request.getSession();
    Map listUser = (Map) session.getAttribute("listUser");

    String username = request.getParameter("name");
    String password = request.getParameter("password");

    if (username.length() < 6) {
      request.setAttribute("error", MessageError.USERNAME_LENGTH);
      request.getRequestDispatcher("./view/signUp.jsp").forward(request, response);
    }
    if (!username.matches("^[^$#@%^&*]\\w+$")) {
      request.setAttribute("error", MessageError.USERNAME_FORMAT);
      request.getRequestDispatcher("./view/signUp.jsp").forward(request, response);
    }

    if (userDao.existedUser(username, listUser)) {
      request.setAttribute("error", MessageError.USERNAME_EXISTED);
      request.getRequestDispatcher("./view/signUp.jsp").forward(request, response);
    }

    if (password.length() < 8) {
      request.setAttribute("error", MessageError.PASSWORD_LENGTH);
      request.getRequestDispatcher("./view/signUp.jsp").forward(request, response);
    }
    if (!password.matches("^((?=.*\\d)(?=.*[A-Z])(?=.*\\W).{8,})$")) {
      request.setAttribute("error", MessageError.PASSWORD_FORMAT);
      request.getRequestDispatcher("./view/signUp.jsp").forward(request, response);
    }

    User currUser = new User(username, password);
    request.setAttribute("currUser", currUser);
    session.setAttribute("currUser", currUser);

    listUser = new HashMap<>();
    listUser.put(username, password);

    session.setAttribute("listUser", listUser);

    request.getRequestDispatcher("./view/index.jsp").forward(request, response);
    request.getRequestDispatcher("./view/userCounter.jsp").forward(request, response);

  }

  /**
   * Returns a short description of the servlet.
   *
   * @return a String containing servlet description
   */
  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
