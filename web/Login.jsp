<%--
    Document   : SubjectRegistration
    Created on : Dec 18, 2018, 10:53:54 PM
    Author     : demonslight998
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="fragment/header.jsp" />


<div class="container form-display">
  <h3 style="color: red">${error}</h3>
  <form action="/LoginController" method="POST">
    <div class="form-group">
      <label>Username</label>
      <input type="text" class="form-control" name="name" placeholder="Enter username">
    </div>
    <div class="form-group">
      <label>Password</label>
      <input type="password" class="form-control" name="password" placeholder="Enter password">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>

<jsp:include page="fragment/footer.jsp" />
