/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.MessageError;
import entity.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.UserDao;

/**
 *
 * @author demonslight998
 */
public class LoginProcess extends HttpServlet {

  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  /**
   * Handles the HTTP <code>GET</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
  }

  /**
   * Handles the HTTP <code>POST</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    HttpSession session = request.getSession();
    UserDao userDao = new UserDao();
    Map listUser = new HashMap<String, String>();

    listUser = (Map) session.getAttribute("listUser");
    String username = request.getParameter("name");
    String password = request.getParameter("password");

    User user = new User(username, password);
    boolean isLogin = userDao.isLogin(user, listUser);

    if (username.isEmpty() || password.isEmpty()) {
      request.setAttribute("error", MessageError.LOGIN_FORMAT);
      request.getRequestDispatcher("Login.jsp").forward(request, response);
    }

    if (isLogin) {
      if (session.getAttribute("listLoggedIn") == null) {
        List<User> listLoggedIn = new ArrayList<>();
        listLoggedIn.add(user);
        session.setAttribute("listLoggedIn", listLoggedIn);
      } else {
        List<User> listLoggedIn = (List<User>) session.getAttribute("listLoggedIn");
        if (!userDao.isExistUser(user, listLoggedIn)) {
          listLoggedIn.add(user);
          session.setAttribute("listLoggedIn", listLoggedIn);
        }
      }
      session.setAttribute("user", user);
      request.getRequestDispatcher("Index.jsp").forward(request, response);
    } else {
      request.setAttribute("errorLogin", MessageError.LOGIN_INCORRECT);
      request.getRequestDispatcher("Login.jsp").forward(request, response);
    }

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
