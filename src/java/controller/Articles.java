/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Article;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ArticleDao;

/**
 *
 * @author demonslight998
 */
public class Articles extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    ArticleDao articleDao = new ArticleDao();
    HttpSession session = request.getSession();
    if (session.getAttribute("user") == null) {
      request.getRequestDispatcher("./view/Login.jsp").forward(request, response);
    } else {
      List<Article> articles = articleDao.getAllArticles();
      request.setAttribute("articles", articles);
      request.getRequestDispatcher("./view/Articles.jsp");
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
