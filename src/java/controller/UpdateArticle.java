/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Article;
import entity.MessageError;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ArticleDao;

/**
 *
 * @author demonslight998
 */
public class UpdateArticle extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    String title = request.getParameter("title");
    String topic = request.getParameter("topic");
    String contents = request.getParameter("contents");
    String releaseDate = request.getParameter("releaseDate");
    String author = request.getParameter("author");
    int status = -1;
    String[] isPublic = request.getParameterValues("status");
    if (isPublic == null) {
      status = 0;
    } else {
      status = 1;
    }

    if (title == null || title.isEmpty()) {
      request.setAttribute("error", MessageError.ARTICLE_NULL_TITLE);
      request.getRequestDispatcher("./view/EditArticle.jsp").forward(request, response);
    }
    if (topic == null || topic.isEmpty()) {
      request.setAttribute("error", MessageError.ARTICLE_NULL_TOPIC);
      request.getRequestDispatcher("./view/EditArticle.jsp").forward(request, response);
    }
    if (contents == null || contents.isEmpty()) {
      request.setAttribute("error", MessageError.ARTICLE_NULL_CONTENTS);
      request.getRequestDispatcher("./view/EditArticle.jsp").forward(request, response);
    }

    Article newArticle = new Article(status, title, topic, contents, releaseDate, author);
    ArticleDao artDao = new ArticleDao();
    artDao.updateArticle(newArticle);
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
