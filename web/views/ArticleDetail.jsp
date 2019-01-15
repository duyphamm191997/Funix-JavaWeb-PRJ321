<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
    Document   : PostDetail
    Created on : Jan 10, 2019, 10:55:53 PM
    Author     : demonslight998
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="../fragment/header.jsp" />

<body id="page-top">

  <jsp:include page="../fragment/navIndex.jsp" />

  <div class="container" style="margin-top: 2rem;">
    <h3>${thisArt.getTitle()}</h3>
    <h4>${thisArt.getTopic()}</h4>
    <h5>${thisArt.getContents()}</h5>
    <h6>${thisArt.getReleaseDate()}</h6>
    <h6>${thisArt.getAuthor()}</h6>
    <div class="form-check">
      <input type="checkbox" class="form-check-input">
      <label class="form-check-label" for="exampleCheck1">${(thisArt.getStatus() == 0) ? "Draft" : "Published"} </label>
    </div>
  </div>

  <jsp:include page="../fragment/footer.jsp" />

