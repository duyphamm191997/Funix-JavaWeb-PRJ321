<%--
    Document   : WelcomePage
    Created on : Dec 30, 2018, 9:01:51 PM
    Author     : demonslight998
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="fragment/header.jsp" />
<jsp:include page="fragment/navWelcome.jsp" />

<div class="container">
  <h3>${welcome}</h3>
</div>

<jsp:include page="fragment/footer.jsp" />
