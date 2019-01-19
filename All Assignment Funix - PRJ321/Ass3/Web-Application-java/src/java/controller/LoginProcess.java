/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.User;
import java.io.IOException;
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
    UserDao userDao = new UserDao();
    HttpSession session = request.getSession();
    Map listUser = (Map) session.getAttribute("listUser");

    String username = request.getParameter("name");
    String password = request.getParameter("password");

    if (username == null || password == null) {
      request.setAttribute("error", MessageError.LOGIN_FORMAT);
      request.getRequestDispatcher("./view//Login.jsp").forward(request, response);
    }

    boolean existedUser = userDao.existedUser(username, listUser);
    if (!existedUser) {
      request.setAttribute("error", MessageError.USERNAME_NOT_FOUND);
      request.getRequestDispatcher("./view//Login.jsp").forward(request, response);
    }

    boolean isLoginSuccess = userDao.isLoginSucess(username, password, listUser);
    if (!isLoginSuccess) {
      request.setAttribute("error", MessageError.LOGIN_INCORRECT);
      request.getRequestDispatcher("./view//Login.jsp").forward(request, response);
    } else {
      User currUser = new User(username, password);
      request.setAttribute("currUser", currUser);
      session.setAttribute("currUser", currUser);
      session.setAttribute("welcome", "Welcome Back");
      request.setAttribute("currUser", currUser);
      request.getRequestDispatcher("./view/index.jsp").forward(request, response);
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
