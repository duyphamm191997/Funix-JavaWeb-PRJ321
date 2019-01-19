/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author demonslight998
 */
public class UserDao {

  /**
   * To check duplicated User
   *
   * @param username
   * @param listUser
   * @return
   */
  public boolean existedUser(String username, Map listUser) {
    if (listUser == null) {
      return false;
    }
    Set set = listUser.entrySet();
    Iterator iter = set.iterator();
    while (iter.hasNext()) {
      Map.Entry entry = (Map.Entry) iter.next();
      String dbUsername = (String) entry.getKey();
      return username.equals(dbUsername);
    }
    return false;
  }

  /**
   * To check logged-in user
   *
   * @param user
   * @param listUser
   * @return true || false
   */
  public boolean isLoginSucess(String username, String password, Map listUser) {
    Set set = listUser.entrySet();
    Iterator iter = set.iterator();
    while (iter.hasNext()) {
      Map.Entry entry = (Map.Entry) iter.next();
      String mapUsername = (String) entry.getKey();
      String mapPassword = (String) entry.getValue();
      return (username.equals(mapUsername) && password.equals(mapPassword));
    }
    return false;
  }

}
