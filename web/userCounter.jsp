<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
    Document   : UserCounter
    Created on : Dec 30, 2018, 9:00:52 PM
    Author     : demonslight998
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="fragment/header.jsp" />

<h1>All logged-in users</h1> <br>
<c:forEach var="item" items="${listLoggedIn}">
  <h3>Username: ${item.getUsername}</h3>
  <h3>Password: ${item.getPassword}</h3>
  <hr>
</c:forEach>

<jsp:include page="fragment/footer.jsp" />
