<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
    Document   : UserCounter
    Created on : Dec 30, 2018, 9:00:52 PM
    Author     : demonslight998
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="../fragment/header.jsp" />

<div class="container">
  <h1>All logged-in users</h1> <hr>
  <%
    Map listUser = (Map) session.getAttribute("listUser");
//    listUser = new HashMap<>();
    List tempUsername = null;
    if (listUser == null) {
      response.sendRedirect("Login.jsp");
    } else {
      tempUsername = new ArrayList(listUser.keySet());
      System.out.println(tempUsername);
    }
  %>
  <% for (Object temp : tempUsername) {%>
  <h3>USER: <span style="color: red"><%= temp.toString()%></span></h3>
    <%}%>


</div>


<jsp:include page="../fragment/footer.jsp" />
