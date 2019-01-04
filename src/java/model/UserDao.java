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

  public boolean checkExistedUser(String username) throws Exception {
    Connection con = null;
    DBContext db = new DBContext();
    try {
      con = db.getConnection();
      Statement stmt = con.createStatement();
      String query = "";
      ResultSet rs = stmt.executeQuery(query);
      while (rs.next()) {
        String firstname = rs.getString(1);
        String lastname = rs.getString(2);
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return false;
  }

  public boolean checkLogin(String username, String password) throws Exception {
    Connection con = null;
    DBContext db = new DBContext();
    try {
      con = db.getConnection();
      Statement stmt = con.createStatement();
      String query = "";
      ResultSet rs = stmt.executeQuery(query);
      while (rs.next()) {
        String firstname = rs.getString(1);
        String lastname = rs.getString(2);
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return false;
  }

}
