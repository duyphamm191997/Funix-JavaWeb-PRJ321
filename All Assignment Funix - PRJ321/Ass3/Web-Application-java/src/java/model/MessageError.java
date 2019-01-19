/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author demonslight998
 */
public class MessageError {

  public static final String USERNAME_LENGTH = "Sign-up failded, Username at least have 6 characters";
  public static final String USERNAME_FORMAT = "Sign-up failded, Username must not contain special characters such as $#@%^&*";
  public static final String USERNAME_EXISTED = "Sign-up failded, User had been existed !";
  public static final String USERNAME_NOT_FOUND = "Login failded, Username not found !";
  public static final String PASSWORD_LENGTH = "Sign-up failded, Password at least have 8 characters";
  public static final String PASSWORD_FORMAT = "Sign-up failded, Password must contain at least one capital letter, one digit,"
          + " one special character";
  public static final String LOGIN_INCORRECT = "Login failded, Username or passwrod  is incorrect";
  public static final String LOGIN_FORMAT = "Login failded, Username & Password can not be blank !";
}
