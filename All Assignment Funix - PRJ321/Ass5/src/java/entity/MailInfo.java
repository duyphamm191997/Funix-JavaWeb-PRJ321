/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author demonslight998
 */
public class MailInfo {

  private static final String host = "smtp.gmail.com";
  private static final String port = "587";
  private static final String email = "mail.funix.test@gmail.com";
  private static final String password = "funix123";

  public static String getHost() {
    return host;
  }

  public static String getPort() {
    return port;
  }

  public static String getEmail() {
    return email;
  }

  public static String getPassword() {
    return password;
  }

}
