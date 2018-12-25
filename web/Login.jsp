<%--
    Document   : SubjectRegistration
    Created on : Dec 18, 2018, 10:53:54 PM
    Author     : demonslight998
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="fragment/header.jsp" />

<div class="container form-display">
  <form action="SubjectRegistration" method="POST">
    <div class="form-group">
      <label for="inputName">Name</label>
      <input type="text" class="form-control" id="inputName" name="name" aria-describedby="emailHelp" placeholder="Enter Name">
    </div>
    <div class="form-group">
      <label for="inputSurname">Surname</label>
      <input type="text" class="form-control" id="inputSurname" name="surname" placeholder="Enter Surname">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>

<jsp:include page="fragment/footer.jsp" />
