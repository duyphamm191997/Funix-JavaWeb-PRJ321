/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author demonslight998
 */
public class EmailDao {

  public Session SendEmailTo(String host, String port,
          final String email, final String password, String toAddress,
          String subject, String message) throws AddressException, MessagingException, UnsupportedEncodingException {
    // sets SMTP server properties
    Properties properties = new Properties();
    properties.put("mail.smtp.host", host);
    properties.put("mail.smtp.port", port);
    properties.put("mail.smtp.auth", "true");
    properties.put("mail.smtp.starttls.enable", "true");

    // creates a new session with an authenticator
    Authenticator auth = new Authenticator() {
      @Override
      public PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(email, password);
      }
    };
    Session session = Session.getInstance(properties, auth);
    return session;
  }

  public Session SendEmailCc(String host, String port,
          final String email, final String password, String ccAddress,
          String subject, String message) throws AddressException, MessagingException, UnsupportedEncodingException {
    // sets SMTP server properties
    Properties properties = new Properties();
    properties.put("mail.smtp.host", host);
    properties.put("mail.smtp.port", port);
    properties.put("mail.smtp.auth", "true");
    properties.put("mail.smtp.starttls.enable", "true");

    // creates a new session with an authenticator
    Authenticator auth = new Authenticator() {
      @Override
      public PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(email, password);
      }
    };
    Session session = Session.getInstance(properties, auth);
    return session;
  }

  public Session SendEmailBcc(String host, String port,
          final String email, final String password, String bccAddress,
          String subject, String message) throws AddressException, MessagingException, UnsupportedEncodingException {
    // sets SMTP server properties
    Properties properties = new Properties();
    properties.put("mail.smtp.host", host);
    properties.put("mail.smtp.port", port);
    properties.put("mail.smtp.auth", "true");
    properties.put("mail.smtp.starttls.enable", "true");

    // creates a new session with an authenticator
    Authenticator auth = new Authenticator() {
      @Override
      public PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(email, password);
      }
    };
    Session session = Session.getInstance(properties, auth);
    return session;
  }
}
