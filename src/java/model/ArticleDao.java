/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBContext;
import entity.Article;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author demonslight998
 */
public class ArticleDao {

  public ArrayList<Article> getAllArticles() {
    ArrayList<Article> listArticle = new ArrayList<Article>();
    Connection con = null;
    DBContext db = new DBContext();
    try {
      con = db.getConnection();
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM dbo.Article WHERE status = 1"
              + " ORDER BY CreatedAt DESC");
      Article article = new Article();
      while (rs.next()) {
        article.setId(rs.getInt(1));
        article.setTitle(rs.getString(2));
        article.setTopic(rs.getString(3));
        article.setContents(rs.getString(4));
        article.setStatus(rs.getInt(5));
        article.setAuthor(rs.getString(6));
        article.setCreatedAt(rs.getDate(7));
        listArticle.add(article);
      }
      rs.close();
      stmt.close();
      con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return listArticle;
  }

  public Article getArticlByID(int id) {
    Article article = new Article();
    String query = "SELECT * FROM dbo.Article WHERE status = 1 AND id = " + id;
    Connection con = null;
    DBContext db = new DBContext();
    try {
      con = db.getConnection();
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery(query);
      while (rs.next()) {
        article.setId(rs.getInt(1));
        article.setTitle(rs.getString(2));
        article.setTopic(rs.getString(3));
        article.setContents(rs.getString(4));
        article.setStatus(rs.getInt(5));
        article.setAuthor(rs.getString(6));
        article.setCreatedAt(rs.getDate(7));

      }
      rs.close();
      stmt.close();
      con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return article;
  }

  public void updateArticle(Article art) {
    Connection con = null;
    DBContext db = new DBContext();
    try {
      con = db.getConnection();
      String sql = "UPDATE dbo.Article SET title = ?, topic = ?, contents = ?, "
              + "status = ? WHERE id = ?";
      PreparedStatement stmt = con.prepareStatement(sql);
      stmt.setString(1, art.getTitle());
      stmt.setString(2, art.getTopic());
      stmt.setString(3, art.getContents());
      stmt.setInt(4, art.getStatus());
      stmt.setInt(5, art.getId());
      stmt.executeUpdate();
      stmt.close();
      con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
