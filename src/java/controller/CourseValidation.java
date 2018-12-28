/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author demonslight998
 */
public class CourseValidation extends HttpServlet {

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
    String fullName = request.getParameter("fullName");

    String country = request.getParameter("country");
    String[] courses = request.getParameterValues("course");
    String language1 = request.getParameter("language1");
    String language2 = request.getParameter("language2");
    String language3 = request.getParameter("language3");

    if (fullName.isEmpty() || fullName.matches(".*\\d+.*")) {
      request.setAttribute("error", "Name cannot be empty and contains no digits !");
      request.getRequestDispatcher("CourseForm.jsp").forward(request, response);
    }
    String ageString = request.getParameter("age");
    int age = 0;
    try {
      age = Integer.parseInt(ageString);
    } catch (Exception e) {
      request.setAttribute("error", "Age cannot be empty !");
      request.getRequestDispatcher("CourseForm.jsp").forward(request, response);
    }
    if (age < 18 && age > 40) {
      request.setAttribute("error", "Age must be more than 18, and less than 40 !");
      request.getRequestDispatcher("CourseForm.jsp").forward(request, response);
    }

    request.setAttribute("fullName", fullName);
    request.setAttribute("ageString", ageString);
    request.setAttribute("country", country);
    request.setAttribute("courses", courses);
    request.setAttribute("language1", language1);
    request.setAttribute("language2", language2);
    request.setAttribute("language3", language3);
    request.getRequestDispatcher("CourseForm.jsp").forward(request, response);

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
