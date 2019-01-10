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

  public ArrayList<Article> getAllArticle() {
    ArrayList<Article> listArticle = new ArrayList<Article>();
    Connection con = null;
    DBContext db = new DBContext();
    try {
      con = db.getConnection();
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("select * from Article as a order by a.createdAt");
      while (rs.next()) {
        Article article = new Article();
        article.setTitle(rs.getString(1));
        article.setTopic(rs.getString(2));
        article.setContents(rs.getString(3));
        article.setStatus(rs.getBoolean(4));
        article.setAuthorID(rs.getInt(5));
        article.setCreatedAt(rs.getDate(6));
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

  public void addArticle(Article art) {
    try {
      Connection con = null;
      DBContext db = new DBContext();
      con = db.getConnection();
      String sql = "INSERT INTO dbo.Article\n"
              + "(\n"
              + "    title,\n"
              + "    topic,\n"
              + "    contents,\n"
              + "    status,\n"
              + "    authorID,\n"
              + "    createdAt\n"
              + ")\n"
              + "VALUES (?, ?, ?, ?, ?, ? )";
      if (con != null) {
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, art.getTitle());
        stmt.setString(2, art.getTopic());
        stmt.setString(3, art.getContents());
        stmt.setBoolean(4, art.isStatus());

//        stmt.setDate(5, new SimpleDateFormat("dd/MM/yyy hh:mm:ss").format(new Date()));
        stmt.executeUpdate();
        stmt.close();
        con.close();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void updateArticle(Article art) {
    Connection con = null;
    DBContext db = new DBContext();
    try {
      con = db.getConnection();
      String sql = "UPDATE dbo.Article SET title = ?, topic = ?, contents = ?, status = ? WHERE id = ?";
      PreparedStatement stmt = con.prepareStatement(sql);
      stmt.setString(1, art.getTitle());
      stmt.setString(2, art.getTopic());
      stmt.setString(3, art.getContents());
      stmt.setBoolean(4, art.isStatus());

      stmt.executeUpdate();
      stmt.close();
      con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
