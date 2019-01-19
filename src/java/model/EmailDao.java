/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

/**
 *
 * @author demonslight998
 */
public class EmailDao {

  public Session preSendEmail(String host, String port,
          final String email, final String password,
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

  public void SendMail(Message msg, InternetAddress address, Message.RecipientType recipentType,
          String email, String subject, String content) throws UnsupportedEncodingException {
    try {
      msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
      msg.addHeader("format", "flowed");
      msg.addHeader("Content-Transfer-Encoding", "8bit");
      msg.setFrom(new InternetAddress(email, "Funix-Test"));
      msg.setRecipient(recipentType, address);
      msg.setSubject(subject);
      msg.setSentDate(new Date());
      msg.setText(content);
      Transport.send(msg);
    } catch (MessagingException ex) {
      ex.printStackTrace();
    }
  }

}
