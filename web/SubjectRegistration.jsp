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
    <title>Subject Registration</title>
  </head>
  <body>

    <div class="container form-display">
      <form action="/SubjectRegistration" method="POST">
        <div class="form-group">
          <label for="inputName">Name</label>
          <input type="text" class="form-control" id="inputName" name="name" aria-describedby="emailHelp" placeholder="Enter Name">
          <!--          <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>-->
        </div>
        <div class="form-group">
          <label for="inputSurname">Surname</label>
          <input type="text" class="form-control" id="inputSurname" name="surname" placeholder="Enter Surname">
        </div>
        <div class="form-group">
          <label for="inputPhone">Phone Number</label>
          <input type="text" class="form-control" id="inputPhone" name="phoneNumber" placeholder="Enter Phone Number">
        </div>
        <div class="form-group">
          <label for="inputEmailAddress">Email Address</label>
          <input type="email" class="form-control" id="inputEmailAddress" name="email" placeholder="Enter Email Address">
        </div>
        <!--        <div class="form-group form-check">
                  <input type="checkbox" class="form-check-input" id="exampleCheck1">
                  <label class="form-check-label" for="exampleCheck1">Check me out</label>
                </div>-->
        <button type="submit" class="btn btn-primary">Submit</button>
      </form>
    </div>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
  </body>
</html>
