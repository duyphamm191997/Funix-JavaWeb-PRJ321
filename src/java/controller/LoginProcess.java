/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    Map account = new HashMap();
    account.put("funix", "123456");
//    account.put("password", "123456");

    String username = request.getParameter("name");
    String password = request.getParameter("password");

    if (username.isEmpty() || password.isEmpty()) {
      request.setAttribute("error", "login failded, Username & Password can not be blank !");
      request.getRequestDispatcher("Login.jsp").forward(request, response);
    }
    if (!account.containsKey(username)) {
      request.setAttribute("error", "login failded, user not found !");
      request.getRequestDispatcher("Login.jsp").forward(request, response);
    } else if (account.containsKey(username) && !account.get(username).equals(password)) {
      request.setAttribute("error", "login failded, password is wrong !");
      request.getRequestDispatcher("Login.jsp").forward(request, response);
    } else {
      request.setAttribute("username", username);
      request.getRequestDispatcher("CourseForm.jsp").forward(request, response);
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
