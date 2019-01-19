<%--
    Document   : SubjectRegistration
    Created on : Dec 18, 2018, 10:53:54 PM
    Author     : demonslight998
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="public/css/style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Charm|Montserrat" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
    <link rel="stylesheet" href="../public/css/login.css"/>
    <title>Login</title>
  </head>
  <body>
    <div class="container form-display">
      <div class="container">
        <div class="row">
          <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
            <div class="card card-signin my-5">
              <div class="card-body">
                <h5 style="color: red">${error}</h5>
                <h5 class="card-title text-center">Login</h5>
                <form class="form-signin" action="/LoginProcess" method="POST">
                  <div class="form-label-group">
                    <input type="text" id="inputEmail" class="form-control" name="name" placeholder="Enter username" required autofocus>
                    <label for="inputEmail">Username</label>
                  </div>

                  <div class="form-label-group">
                    <input type="password" id="inputPassword" class="form-control" name="password" placeholder="Enter password" required>
                    <label for="inputPassword">Password</label>
                  </div>

                  <div class="custom-control custom-checkbox mb-3">
                    <input type="checkbox" class="custom-control-input" id="customCheck1">
                    <label class="custom-control-label" for="customCheck1">Remember password</label>
                  </div>

                  <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Login</button>
                  <a class="btn btn-lg btn-warning btn-block text-uppercase" role="button" href="../view/welcomePage.jsp">Cancel</a>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>

      <jsp:include page="../fragment/footer.jsp" />
