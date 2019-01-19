/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.MailInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.EmailDao;

/**
 *
 * @author demonslight998
 */
public class SendMail extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    try {
      EmailDao emailDao = new EmailDao();
      String host = MailInfo.getHost();
      String port = MailInfo.getPort();
      String email = MailInfo.getEmail();
      String pass = MailInfo.getPassword();
      String subject = request.getParameter("subject");
      String content = request.getParameter("content");

      String recipientTo = request.getParameter("recipient");
      String[] toList = recipientTo.split(", ");

      String recipientCc = request.getParameter("cc");
      String[] ccList = recipientCc.split(", ");

      String recipientBcc = request.getParameter("bcc");
      String[] bccList = recipientBcc.split(", ");

      InternetAddress[] recipientTos = new InternetAddress[toList.length];
      int counterTo = 0;
      for (String rec : recipientList) {
        recipientAddress[counterTo] = new InternetAddress(rec.trim());
        counterTo++;
      }

      Message msg = new MimeMessage(emailDao.SendEmail(host, port, email, pass, recipient, cc, subject, pass));
      msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
      msg.addHeader("format", "flowed");
      msg.addHeader("Content-Transfer-Encoding", "8bit");
      msg.setFrom(new InternetAddress(email, "Funix-Test"));
      msg.setRecipients(Message.RecipientType.TO, recipientAddress);
      msg.setRecipients(Message.RecipientType.CC, toCC);
      msg.setSubject(subject);
      msg.setSentDate(new Date());
      msg.setText(message);

      // sends the e-mail
      Transport.send(msg);

      request.setAttribute("result", "Sent email successfully !");
      request.getRequestDispatcher("./view/ResultSentEmail.jsp").forward(request, response);
    } catch (MessagingException ex) {
      request.setAttribute("result", "Error: " + ex.getMessage());
      request.getRequestDispatcher("./view/ResultSentEmail.jsp").forward(request, response);
    }
  }

  /**
   * Returns a short description of the servlet.
   *
   * @return a String containing servlet description
   */
  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
