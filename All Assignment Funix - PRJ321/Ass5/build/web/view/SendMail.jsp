<%--
    Document   : SendMail
    Created on : Jan 18, 2019, 10:56:23 AM
    Author     : demonslight998
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="public/css/style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Charm|Montserrat" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
    <link rel="stylesheet" href="../public/css/login.css"/>
    <title>Send Mail</title>
  </head>
  <body style="background-color: #9CECFB">
    <div class="top-content">
      <div class="inner-bg">
        <div class="container">
          <div class="row">
            <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
              <div class="form-top">
                <div class="form-top-left">
                  <h3>Send mail</h3>
                  <p>Enter your content to send</p>
                </div>
                <div class="form-top-right">
                  <a href="/LogoutProcess">
                    <i class="fas fa-sign-out-alt"> Logout</i>
                  </a>
                </div>
              </div>
              <div class="form-bottom">
                <div class="card card-signin my-3">
                  <h3 style="color: red">${error}</h3>
                  <div class="card-body">
                    <form  class="" action="/SendMail" method="POST">
                      <div class="form-label-group">
                        <input type="text" class="form-control" name="to" placeholder="To..." required autofocus>
                        <label for="">To</label>
                      </div>
                      <div class="form-label-group">
                        <input type="text" class="form-control" name="cc" placeholder="CC..." required>
                        <label for="">CC</label>
                      </div>
                      <div class="form-label-group">
                        <input type="text" class="form-control" name="bcc" placeholder="BCC..." required>
                        <label for="">BCC</label>
                      </div>
                      <div class="form-label-group">
                        <input type="text" class="form-control" name="subject" placeholder="Subject..." required>
                        <label for="">Subject</label>
                      </div>
                      <div class="form-group">
                        <textarea class="form-control" rows="5" placeholder="Content..." name="content"></textarea>
                      </div>
                      <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Send Mail</button>
                    </form>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <jsp:include page="../fragment/footer.jsp" />
