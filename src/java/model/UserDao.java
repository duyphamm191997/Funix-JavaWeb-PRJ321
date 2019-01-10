/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DBContext;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author demonslight998
 */
public class UserDao {

  public boolean checkExistedUser(String usernameXXX) throws Exception {
    Connection con = null;
    DBContext db = new DBContext();
    try {
      con = db.getConnection();
      Statement stmt = con.createStatement();
      String query = "SELECT a.username FROM dbo.Account AS a WHERE a.username = " + usernameXXX;
      ResultSet rs = stmt.executeQuery(query);
      while (rs.next()) {
        String username = rs.getString(1);
        return username.equals(usernameXXX);
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return false;
  }

  public boolean checkPassword(String username, String pass) {
    Connection con = null;
    DBContext db = new DBContext();
    try {
      con = db.getConnection();
      Statement stmt = con.createStatement();
      String sql = "SELECT a.password FROM dbo.Account AS a WHERE a.username = " + username;
      ResultSet rs = stmt.executeQuery(sql);
      while (rs.next()) {
        String password = rs.getString(1);
        return pass.equals(password);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return false;
  }
}
