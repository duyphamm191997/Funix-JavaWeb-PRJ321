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

      String recipientTo = request.getParameter("to");
      String[] toList = recipientTo.split(", ");

      String recipientCc = request.getParameter("cc");
      String[] ccList = recipientCc.split(", ");

      String recipientBcc = request.getParameter("bcc");
      String[] bccList = recipientBcc.split(", ");

      InternetAddress[] myToList = new InternetAddress[toList.length];
      InternetAddress[] myCcList = new InternetAddress[ccList.length];
      InternetAddress[] myBccList = new InternetAddress[bccList.length];

      int countTo = 0;
      for (String recTo : toList) {
        Message msg = new MimeMessage(emailDao.preSendEmail(host, port, email, pass, subject, pass));
        myToList[countTo] = new InternetAddress(recTo.trim());
        emailDao.SendMail(msg, myToList, Message.RecipientType.TO, email, subject, content);
        countTo++;
      }

      int countCc = 0;
      for (String recCc : ccList) {
        Message msg = new MimeMessage(emailDao.preSendEmail(host, port, email, pass, subject, pass));
        myCcList[countCc] = new InternetAddress(recCc.trim());
        emailDao.SendMail(msg, myCcList, Message.RecipientType.CC, email, subject, content);
        countCc++;
      }

      int countBcc = 0;
      for (String recBcc : bccList) {
        Message msg = new MimeMessage(emailDao.preSendEmail(host, port, email, pass, subject, pass));
        myBccList[countBcc] = new InternetAddress(recBcc.trim());
        emailDao.SendMail(msg, myBccList, Message.RecipientType.BCC, email, subject, content);
      }
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
