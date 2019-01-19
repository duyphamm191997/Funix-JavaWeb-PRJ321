<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
    Document   : Info
    Created on : Dec 30, 2018, 9:00:32 PM
    Author     : demonslight998
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="../fragment/header.jsp" />

<div class="container">
  <h1>User's profile</h1>
  <hr>
  <h3>Username: <span style="color: red">${currUser.getUsername()}</span></h3>
  <h3>Password: <span style="color: red">${currUser.getPassword()}</h3>
</div>

<jsp:include page="../fragment/footer.jsp" />
