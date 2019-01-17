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
import javax.servlet.http.HttpSession;
import model.ArticleDao;

/**
 *
 * @author demonslight998
 */
public class EditArticle extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    HttpSession session = request.getSession();
    Article thisArt = (Article) session.getAttribute("thisArt");

    String title = request.getParameter("title");
    String topic = request.getParameter("topic");
    String contents = request.getParameter("contents");
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
    thisArt.setTitle(title);
    thisArt.setTopic(topic);
    thisArt.setContents(contents);
    thisArt.setStatus(status);
    ArticleDao artDao = new ArticleDao();
    artDao.updateArticle(thisArt);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    int id = Integer.parseInt(request.getParameter("id"));
    ArticleDao articleDao = new ArticleDao();
    Article thisArt = articleDao.getArticlByID(id);
    HttpSession session = request.getSession();
    session.setAttribute("thisArt", thisArt);
    request.getRequestDispatcher("./view/ArticleEdit.jsp").forward(request, response);
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
