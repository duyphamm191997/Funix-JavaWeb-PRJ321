<%--
    Document   : Info
    Created on : Dec 30, 2018, 9:00:32 PM
    Author     : demonslight998
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="fragment/header.jsp" />

<h1>User's profile</h1>
<h3>Username: ${user.getUsername()}</h3>
<h3>Password: ${user.getPassword()}</h3>

<jsp:include page="fragment/footer.jsp" />
