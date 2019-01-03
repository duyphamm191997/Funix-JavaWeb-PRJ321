/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.User;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author demonslight998
 */
public class UserDao {

  /**
   * To check existed UserName
   *
   * @param user
   * @param listLoggedIn
   * @return
   */
  public boolean isExistUser(User user, List<User> listLoggedIn) {
    for (User item : listLoggedIn) {
      if (item.getUsername().equals(user.getUsername())) {
        return true;
      }
    }
    return false;
  }

  /**
   * To check duplicated User
   *
   * @param username
   * @param listUser
   * @return
   */
  public boolean isDuplicateUser(String username, Map listUser) {
    Set set = listUser.entrySet();
    Iterator iter = set.iterator();
    while (iter.hasNext()) {
      Map.Entry entry = (Map.Entry) iter.next();
      String dbUsername = (String) entry.getKey();
      if (username.equals(dbUsername)) {
        return true;
      }
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
  public boolean isLogin(User user, Map listUser) {
    Set set = listUser.entrySet();
    Iterator iter = set.iterator();
    while (iter.hasNext()) {
      Map.Entry entry = (Map.Entry) iter.next();
      String dbUsername = (String) entry.getKey();
      String dbPassword = (String) entry.getValue();
      if (user.getPassword().equals(dbPassword) && user.getUsername().equals(dbUsername)) {
        return true;
      }
    }

    return false;
  }

}
